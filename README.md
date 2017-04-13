# poligon
# drawers.string
In this package we provide numerous fancy drawers for given strings.
* **Saw1Drawer**

ex., _string="012345678901234567890"_ and _height=5_

|   |   |   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|---|---|
| 0 |   |   |   |   | 0 |   |   |   |   | 0 |
| 1 |   |   |   | 9 | 1 |   |   |   | 9 |   |
| 2 |   |   | 8 |   | 2 |   |   | 8 |   |   |
| 3 |   | 7 |   |   | 3 |   | 7 |   |   |   |
| 4 | 6 |   |   |   | 4 | 6 |   |   |   |   |
| 5 |   |   |   |   | 5 |   |   |   |   |   |

ex., _string="012345678901234567890"_ and _height=4_

|   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|
| 0 |   |   |   | 8 |   |   |   | 6 |
| 1 |   |   | 7 | 9 |   |   | 5 | 7 |
| 2 |   | 6 |   | 0 |   | 4 |   | 8 |
| 3 | 5 |   |   | 1 | 3 |   |   | 9 |
| 4 |   |   |   | 2 |   |   |   | 0 |

* **Saw2Drawer**

ex., _string="012345678901234"_ and _height=4_

|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| 0 |   |   |   |   |   |   |   | 8 |   |   |   |   |   |   |
|   | 1 |   |   |   |   |   | 7 |   | 9 |   |   |   |   |   |
|   |   | 2 |   |   |   | 6 |   |   |   | 0 |   |   |   | 4 |
|   |   |   | 3 |   | 5 |   |   |   |   |   | 1 |   | 3 |   |
|   |   |   |   | 4 |   |   |   |   |   |   |   | 2 |   |   |

ex., _string="012345678901234"_ and _height=4_

|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| 0 |   |   |   |   |   |   |   |   |   | 0 |   |   |   |   |
|   | 1 |   |   |   |   |   |   |   | 9 |   | 1 |   |   |   |
|   |   | 2 |   |   |   |   |   | 8 |   |   |   | 2 |   |   |
|   |   |   | 3 |   |   |   | 7 |   |   |   |   |   | 3 |   |
|   |   |   |   | 4 |   | 6 |   |   |   |   |   |   |   | 4 |
|   |   |   |   |   | 5 |   |   |   |   |   |   |   |   |   |

* **Saw3Drawer**

ex., _string="01234567890123456"_ and _height=4_

|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| 0 |   |   |   |   |   |   |   |   |   | 0 |   |   |   |   |   |   |
|   | 1 |   |   |   |   |   |   |   | 9 |   | 1 |   |   |   |   |   |
|   |   | 2 |   |   |   |   |   | 8 |   |   |   | 2 |   |   |   |   |
|   |   |   | 3 |   | 5 |   | 7 |   |   |   |   |   | 3 |   | 5 |   |
|   |   |   |   | 4 |   | 6 |   |   |   |   |   |   |   | 4 |   | 6 |

ex., _string="01234567890123456"_ and _height=5_

|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| 0 |   |   |   |   |   |   |   |   |   |   |   | 2 |   |   |
|   | 1 |   |   |   |   |   |   |   |   |   | 1 |   | 3 |   |
|   |   | 2 |   |   |   |   |   |   |   | 0 |   |   |   | 4 |
|   |   |   | 3 |   |   |   |   |   | 9 |   |   |   |   |   |
|   |   |   |   | 4 |   | 6 |   | 8 |   |   |   |   |   |   |
|   |   |   |   |   | 5 |   | 7 |   |   |   |   |   |   |   |

Moreover we ship abstract class **SawDrawer** to simplify creation of
similar Drawers:
- _part_ is repeatable sequence (ex. for the first example of the Saw1Drawer the _part_ is a first matrix(6x5)
- _height_ is a number of (rows - 1)
- _period_ is a number of characters in a _part_

We want to have full control over creation of instances of different saw drawers
so we have to use **SawDrawerFactory**. Furthermore - in this factory we perform field validation
(much more natural than in the appropriate conctructors).
