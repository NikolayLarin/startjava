--\i queries.sql

SELECT * FROM jaegers;                       -- вывод всей таблицы

SELECT * FROM jaegers                        -- отображаем только не уничтоженных роботов
WHERE NOT status = 'Destroyed';

SELECT * FROM jaegers                        -- отображаем роботов серий Mark-2 и Mark-6
WHERE mark = 'Mark-6' OR mark = 'Mark-2';

SELECT * FROM jaegers                        -- сортируем таблицу по возрастанию в столбцу mark
ORDER BY mark;

SELECT * FROM jaegers                        -- сортируем таблицу по убыванию в столбцу mark
ORDER BY mark DESC;

SELECT * FROM jaegers                        -- отображаем самого старого робота
ORDER BY launch
LIMIT 1;

SELECT * FROM jaegers                        -- отображаем роботов, уничтоживших больше всех kaiju
ORDER BY kaijuKill DESC
LIMIT 1;

SELECT * FROM jaegers                        -- отображаем роботов, уничтоживших меньше всех kaiju
ORDER BY kaijuKill
LIMIT 1;

SELECT AVG(weight) AS Average_weight FROM jaegers;   -- отображаем средний вес роботов

SELECT * FROM jaegers                               
WHERE NOT status = 'Destroyed';              -- отображаем неуничтоженных роботов

UPDATE jaegers                               -- увеличиваем на единицу количество уничтоженных
SET kaijuKill = kaijuKill + 1                -- kaiju у роботов, которые
WHERE NOT status = 'Destroyed';              -- до сих пор не разрушены

SELECT * FROM jaegers                        -- и отображаем
WHERE NOT status = 'Destroyed';

DELETE FROM jaegers                          -- удаляем уничтоженных роботов
WHERE status = 'Destroyed';
SELECT * FROM jaegers;
