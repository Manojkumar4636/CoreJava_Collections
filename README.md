# CoreJava_Collections


Collection(Interface) - Refferance Table
----------------------------------------

-------------------------------|-----------------------------------------|---------------------------------------------|
List                           |                 Set                     |                  Map                        |
-------------------------------|-----------------------------------------|---------------------------------------------|
ArrayList                      |     HashSet       --> Random            |       HashMap       --> Random              |
LinkedList                     |     LinkedHashSet --> Insertion         |       LinkedHashMap --> Insertion           |
Stack     ---->Not Use         |     TreeSet       --> Accesending       |       TreeMap       --> Assenting           |
Vector    ---->Not Use         |                                         |       HashTable     --> Random              |
-------------------------------|-----------------------------------------|---------------------------------------------|
                               |                                         |                                             |
=>List duplicate values are    |=>Set Duplicate values are NOT allowed   |=>Map duplicate Keys are NOT allowed and     |
  allowed and Insertion        |  and Insertion order is NOT maintained. |  duplicate Values are allowed.              |
  order is maintained.         |  but LinkedHashSet Insertion order      |                                             |
                               |  is maintained.                         |                                             |
                               |                                         |                                             |
-------------------------------|-----------------------------------------|---------------------------------------------|
                               |                                         |                                             |
=>List is index based,         |=>Set is value based.                    |=>Map is a key and value pair combination.   |
  Start with 0 to n-1.         |                                         |                                             |
-------------------------------|-----------------------------------------|---------------------------------------------|
                               |                                         |                                             |
ArrayList:                     |                                         |                                             |
-----------                    |                                         |                                             |
=>Best suited for search       |                                         |                                             | 
  operations and performs worst|                                         |                                             |
  on insertion and deletion.   |                                         |                                             |
                               |                                         |                                             |
LinkedList:                    |                                         |                                             |
-----------                    |                                         |                                             |
=>This is best suited for      |                                         |                                             |
  insertion and deletion       |                                         |                                             |
  operations.                  |                                         |                                             |
-------------------------------|-----------------------------------------|---------------------------------------------|
                               |                                         |                                             |
=>NULL insertion is possible   |=>NULL insertion is possible             |=>HashMap - Only one NULL key is allowed.    |
                               |                                         |            more then one NULL key is passed |
                               |                                         |            Values are overrided.            |
                               |                                         |                                             |
                               |                                         |=>LinkedHashMap - Only one NULL key is       |
                               |                                         |                  allowed. more then one NULL|
                               |                                         |                  key is passed values are   |
                               |                                         |                  overrided.                 |
                               |                                         |                                             |
                               |                                         |=>TreeMap - NULL key is not allowed.         |  
                               |                                         |                                             |
-------------------------------|-----------------------------------------|---------------------------------------------|

                                                                                             
