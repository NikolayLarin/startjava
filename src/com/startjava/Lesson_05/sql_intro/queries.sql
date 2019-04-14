--\i queries.sql

SELECT * FROM jaegers;                       -- ����� ���� �������

SELECT * FROM jaegers                        -- ���������� ������ �� ������������ �������
WHERE NOT status = 'Destroyed';

SELECT * FROM jaegers                        -- ���������� ������� ����� Mark-2 � Mark-6
WHERE mark = 'Mark-6' OR mark = 'Mark-2';

SELECT * FROM jaegers                        -- ��������� ������� �� ����������� � ������� mark
ORDER BY mark;

SELECT * FROM jaegers                        -- ��������� ������� �� �������� � ������� mark
ORDER BY mark DESC;

SELECT * FROM jaegers                        -- ���������� ������ ������� ������
ORDER BY launch
LIMIT 1;

SELECT * FROM jaegers                        -- ���������� �������, ������� ���������� ������ ���� kaiju
ORDER BY kaijuKill DESC
LIMIT 1;

SELECT * FROM jaegers                        -- ���������� �������, ������� ���������� ������ ���� kaiju
ORDER BY kaijuKill
LIMIT 1;

SELECT AVG(weight) AS Average_weight FROM jaegers;  --���������� ������� ��� �������


SELECT * FROM jaegers                               
WHERE NOT status = 'Destroyed';
UPDATE jaegers                                      -- ����������� �� ������� ���������� ������������
SET kaijuKill = kaijuKill + 1                       -- kaiju � �������, �������
WHERE NOT status = 'Destroyed';                     -- �� ��� ��� �� ��������� 
SELECT * FROM jaegers                               -- � ����������
WHERE NOT status = 'Destroyed';
;

DELETE FROM jaegers                         -- ������� ������������ �������
WHERE status = 'Destroyed';
SELECT * FROM jaegers;
