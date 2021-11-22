# Joins

# Visitors and their hosts
# Left join
select
       v.first_name as visitor_fn, v.last_name as visitor_ln,
       m.first_name as martian_fn, m.last_name as martian_ln
from visitor as v
left join martian as m
on v.host_id = m.martian_id;

# Each Martian and the person the report to
# Self join
select
    m.first_name as fn, m.last_name as ln,
    s.first_name as super_fn, s.last_name as super_ln
from martian m
left join martian as s
on m.super_id = s.martian_id
order by m.martian_id;

# Inventory report (base supply inventory report)
# Subquery
# Right join - since we want all suplies listen even those not at base
select s.supply_id, coalesce(i.quantity, 0), s.name, s.description from
(select * from inventory where base_id = 1) as i
right join supply as s
on i.supply_id = s.supply_id
order by s.supply_id;

# No Host Report
# Every visitor to Mars should have a host.
# List visitors without a host
# Should have been full join not supported by mysql. This query does thus not make sense.
select *
from visitor as v
left outer join martian as m
on v.host_id = m.martian_id
where m.martian_id is null;
