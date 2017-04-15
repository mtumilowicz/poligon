# poligon
### project structure
```
├── poligon/
│   ├── drawers.string
│   │   ├── Saw1Drawer
│   │   ├── Saw2Drawer
│   │   ├── Saw3Drawer
│   │   ├── SawDrawer
│   │   ├── SawDrawerFactory
│   │   ├── SawDrawerName
│   │   ├── StringDrawer
│   ├── problems.brackets
│   │   ├── BalanceChecker
│   │   ├── BalancedBracketsGenerator
│   │   ├── BalancedPartsRemover
│   │   ├── BalancedMixedBracketsGenerator
│   │   ├── BalanceParenthesesChecker
│   │   ├── MinimalBracketFlipsToBalance
│   │   ├── TwoArgumentBracketsGrouper
```

### links
**[drawers.string](#drawers.string)**  
-- [Saw1Drawer](#Saw1Drawer)  
-- [Saw2Drawer](#Saw2Drawer)  
-- [Saw3Drawer](#Saw3Drawer)  
-- [SawDrawer](#SawDrawer)  
-- [SawDrawerFactory](#SawDrawerFactory)  
-- [SawDrawerName](#SawDrawerName)  
-- [StringDrawer](#StringDrawer)  
**[problems.brackets](#problems.brackets)**  
-- [BalanceChecker](#BalanceChecker)  
-- [BalancedBracketsGenerator](#BalancedBracketsGenerator)  
-- [BalancedPartsRemover](#BalancedPartsRemover)  
-- [BalancedMixedBracketsGenerator](#BalancedMixedBracketsGenerator)  
-- [BalanceParenthesesChecker](#BalanceParenthesesChecker)  
-- [MinimalBracketFlipsToBalance](#MinimalBracketFlipsToBalance)  
-- [TwoArgumentBracketsGrouper](#TwoArgumentBracketsGrouper)
<a name="drawers.string"></a>
## drawers.string
In this package we provide numerous fancy drawers for given strings.
<a name="Saw1Drawer"></a>
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

<a name="Saw2Drawer"></a>
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

<a name="Saw3Drawer"></a>
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

<a name="SawDrawer"></a>
Moreover we ship abstract class **SawDrawer** to simplify creation of
similar Drawers:
- _part_ is repeatable sequence (ex. for the first example of the 
Saw1Drawer the _part_ is a first matrix(6x5)
- _height_ is a number of (rows - 1)
- _period_ is a number of characters in a _part_

<a name="SawDrawerFactory"></a>
We want to have full control over creation of instances of different saw 
drawers so we have to use **SawDrawerFactory**. Furthermore - in this 
factory we perform field validation (much more natural than in the 
appropriate conctructors).
<a name="problems.brackets"></a>
## problems.brackets

In this package we would like to present solutions to problems & tasks
concerning brackets, that we have spotted during surfing on the internet 
or in the interviews.
<a name="BalanceChecker"></a>
* **BalanceChecker**
is a solution to the following problem:  
*For a given string and brackets map decide if string is balanced. It's
easier to show examples of balanced and unbalanced strings than showing
exact definition, so:  
(()(()()))() - is *balanced*  
()))() - is *unbalanced*  
solution is construct using the stack structure.*
<a name="BalancedBracketsGenerator"></a>
* **BalancedBracketsGenerator**
is a solution to the following problem:  
*For a given number of pairs, generate all possible balanced 
brackets '(' & ')'. It's very important to have a good approach to such
tasks - producing all possible combinations of '(' & ')' and then filtering
which combination is balanced, is a very poor solution - we decide to choose 
different way: construct solution by recursion.*
<a name="BalancedPartsRemover"></a>
* **BalancedPartsRemover**
is a solution to the following problem:  
*From a given string containing only '(' & ')' remove all balanced (in 
 sense of BalanceChecker) parts.  
 Solution is construct using the stack structure.*
