--\i queries.sql

select * from jaegers;
-- вывод всей таблицы

select * from jaegers
where not status = 'Destroyed';
-- отображаем только не уничтоженных роботов

select * from jaegers
where mark = 'Mark-2' or mark = 'Mark-6';
-- отображаем роботов серий Mark-2 и Mark-6

select * from jaegers
order by mark;
-- сортируем таблицу по возрастанию в столбце mark

select * from jaegers
order by mark desc;
-- сортируем таблицу по убыванию в столбце mark

select min(launch) FROM jaegers
-- отображаем самого старого робота

select max(kaijuKill) FROM jaegers
-- отображаем роботов, уничтоживших больше всех kaiju

select min(kaijuKill) FROM jaegers
-- отображаем роботов, уничтоживших меньше всех kaiju

select avg(weight) as Average_weight from jaegers;
-- отображаем средний вес роботов

select * from jaegers
where not status = 'Destroyed';
-- отображаем неуничтоженных роботов

update jaegers
set kaijuKill = kaijuKill + 1
where not status = 'Destroyed';
-- увеличиваем на единицу количество уничтоженных
-- kaiju у неуничтоженных роботов

select * from jaegers
where not status = 'Destroyed';
-- и отображаем

delete from jaegers
where status = 'Destroyed';
select * from jaegers;
-- удаляем уничтоженных роботов и отображаем
