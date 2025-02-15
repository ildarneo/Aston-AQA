Ресурс, на котором будут решаться задачи
https://www.db-fiddle.com/f/acUhWZEc8aQTqHte3ngD1F/1
Небольшое пояснение:
В левой части «Schema SQL» запросы на создание таблиц, а также заполнение их данными. Туда мы ничего не пишем.
В правой части «Query SQL» пишутся запросы на выборку, это наше основное рабочее пространство. В данной части мы решаем все
задачи.
Данная часть выполняет все запросы, которые в ней записаны
Чтобы выполнить запрос, то нужно зажать «CTRL + Enter», либо в хедере нажать “Run”.
После выполнения запроса снизу появится выборка, либо ошибка (если запрос был составлен неверно). Если снизу ничего не
показывается, то проверьте расширения в браузере (например, Adblock блокирует вывод).
У нашей БД следующая схема (взята отсюда – клик):

![image](https://github.com/user-attachments/assets/847de161-4c2f-44c8-817e-2ce429476d86)


The following picture shows the table names and their records.

Table	Rows
employees	40
dependents	30
departments	11
jobs	11
locations	7
countries	25
regions	4

В данной схеме следующие обозначения:
- символом «*» обозначаются первичные ключи;
- «(fk)» после наименования поля обозначаются внешние ключи;
- стрелочками обозначены связи между таблицами (например, таблица employyes связана с таблицей departments по department_id).
Список SQL задач
1. Выполнить запрос, который выведет все строки из таблицы Employees.
2. Выполнить запрос, который выведет все строки из таблицы Employees. Также нужно отсортировать данные по ID департамента.
3. Выведите ID сотрудника, имя, фамилию и email сотрудников, которых зовут Steven.
4. Выведите ID, имя, фамилию и зарплату сотрудников, у которых зарплата более 10000, в порядке возрастания зп.
5. Выведите ID, имя, фамилию, зарплату в долларах и зарплату в рублях сотрудников, у которых зарплата в рублях больше, чем
1100000 рублей (считайте, что в таблице зарплата указана в долларах. Курс доллара к рублю равен 91.5).
6. Выведите ID департамента, минимальную и максимальную зарплаты сотрудников в департаменте, а также количество
сотрудников в департаменте. Также нужно отсортировать данные по количеству сотрудников в департаменте в порядке
возрастания.
7. Выведите имя, фамилию, наименование департамента сотрудника и город, в котором находится департамент.
8. Выведите наименования департаментов только у тех департаментов, в которых нет ни одного сотрудника.
9. Выведите наименования департаментов и их города только у тех департаментов, которые содержат в наименовании букву “l” (L
строчная).
10. Выведите имя, фамилию, ID департамента и наименование департамента только тех сотрудников, которые работают в
департаментах с ID 2 и 5.
Выполненные задания предоставить в виде документа, где нужно отобразить следующее: Задание, Текст запроса, скрин выполненного
запроса и результата его выполнения.
