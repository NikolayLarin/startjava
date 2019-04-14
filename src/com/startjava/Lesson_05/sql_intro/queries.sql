--\i queries.sql

SELECT * FROM jaegers;                       -- вывод всей таблицы

SELECT * FROM jaegers                        -- отображаем только не уничтоженных роботов
WHERE NOT status = 'Destroyed';

SELECT * FROM jaegers                        -- отобразите роботов серий Mark-2 и Mark-6
WHERE mark = 'Mark-6' OR mark = 'Mark-2';

SELECT * FROM jaegers                        -- ñîðòèðóåì òàáëèöó ïî âîçðàñòàíèþ â ñòîëáöå mark
ORDER BY mark;

SELECT * FROM jaegers                        -- ñîðòèðóåì òàáëèöó ïî óáûâàíèþ â ñòîëáöå mark
ORDER BY mark DESC;

SELECT * FROM jaegers                        -- îòîáðàæàåì ñàìîãî ñòàðîãî ðîáîòà
ORDER BY launch
LIMIT 1;

SELECT * FROM jaegers                        -- îòîáðàæàåì ðîáîòîâ, êîòîðûå óíè÷òîæèëè áîëüøå âñåõ kaiju
ORDER BY kaijuKill DESC
LIMIT 1;

SELECT * FROM jaegers                        -- îòîáðàæàåì ðîáîòîâ, êîòîðûå óíè÷òîæèëè ìåíüøå âñåõ kaiju
ORDER BY kaijuKill
LIMIT 1;

SELECT AVG(weight) AS Average_weight FROM jaegers;  --îòîáðàæàåì ñðåäíèé âåñ ðîáîòîâ


SELECT * FROM jaegers                               
WHERE NOT status = 'Destroyed';
UPDATE jaegers                                      -- óâåëè÷èâàåì íà åäèíèöó êîëè÷åñòâî óíè÷òîæåííûõ
SET kaijuKill = kaijuKill + 1                       -- kaiju ó ðîáîòîâ, êîòîðûå
WHERE NOT status = 'Destroyed';                     -- äî ñèõ ïîð íå ðàçðóøåíû 
SELECT * FROM jaegers                               -- è îòîáðàæàåì
WHERE NOT status = 'Destroyed';
;

DELETE FROM jaegers                         -- óäàëÿåì óíè÷òîæåííûõ ðîáîòîâ
WHERE status = 'Destroyed';
SELECT * FROM jaegers;
