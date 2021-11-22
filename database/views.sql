# How to create a view
# First create the query
# Then use create view above
create view martian_public as
select martian_id, first_name, last_name, base_id, super_id
from martian_confidential;

# View of all persons on Mars (martians and visitors)
create view people_on_mars as
select concat('m', martian_id) as id, first_name, last_name, 'Martian' as status
from martian_public
union
select concat('v', visitor_id), first_name, last_name, 'Visior' as status
from  visitor;

# Create view of supply quantities at each base
create view base_storage as
select b.base_id, s.supply_id, s.name,
       coalesce(
           (select quantity from inventory where base_id = b.base_id and supply_id = s.supply_id), 0)
           as quantity
from base as b
cross join supply as s;
