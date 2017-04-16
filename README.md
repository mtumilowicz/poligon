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
│   │   ├── BalancedParenthesisGenerator
│   │   ├── BalancedPartsRemover
│   │   ├── BalancedMixedBracketsGenerator
│   │   ├── BalanceParenthesisChecker
│   │   ├── MinimalParenthesisFlipToBalance
│   │   ├── TwoArgumentParenthesisGrouper
```

### links
**[drawers.string](#drawers.string)**  
-- [Saw1Drawer](#Saw1Drawer)  
-- [Saw2Drawer](#Saw2Drawer)  
-- [Saw3Drawer](#Saw3Drawer)  
-- [SawDrawer](#SawDrawer)  
-- [SawDrawerFactory](#SawDrawerFactory)  
**[problems.brackets](#problems.brackets)**  
-- [BalanceChecker](#BalanceChecker)  
-- [BalancedParenthesisGenerator](#BalancedParenthesisGenerator)  
-- [BalancedPartsRemover](#BalancedPartsRemover)  
-- [BalancedMixedBracketsGenerator](#BalancedMixedBracketsGenerator)  
-- [BalanceParenthesisChecker](#BalanceParenthesisChecker)  
-- [MinimalParenthesisFlipToBalance](#MinimalParenthesisFlipToBalance)  
-- [TwoArgumentParenthesisGrouper](#TwoArgumentParenthesisGrouper)
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
appropriate constructors).
<a name="problems.brackets"></a>
## problems.brackets

In this package we would like to present solutions to problems & tasks
concerning brackets, that we have spotted during surfing on the internet 
or in the interviews.
<a name="BalanceChecker"></a>
* **BalanceChecker**
is a solution to the following problem:  
*For the given string and brackets map decide if string is balanced. It's
easier to show examples of balanced and unbalanced strings than showing
exact definition, so:  
(()(()()))() - is *balanced*  
()))() - is *unbalanced*  
solution is construct using the stack structure.*
<a name="BalancedParenthesisGenerator"></a>
* **BalancedParenthesisGenerator**
is a solution to the following problem:  
*For the given number of pairs, generate all possible balanced 
brackets '(' & ')'. It's very important to have a good approach to such
tasks - producing all possible combinations of '(' & ')' and then filtering
which combination is balanced, is a very poor solution - we decide to choose 
different way: construct solution by recursion.*
<a name="BalancedPartsRemover"></a>
* **BalancedPartsRemover**
is a solution to the following problem:  
*From the given string containing only '(' & ')' remove all balanced (in 
sense of BalanceChecker) parts.  
For example: )((()())())))((( -> )))(((  
Solution is construct using the stack structure.*
<a name="BalancedMixedBracketsGenerator"></a>
* **BalancedMixedBracketsGenerator**
is a solution to the following problem:  
*For the given number of pairs generate all balanced (in sense of 
BalanceChecker) strings containing only: '(', ')', '\[', '\]', '{', '}'. 
We do it in a hardly inefficient way (take a look at optimal solution in
BalancedParenthesisGenerator - it's hardly impossible to extend this solution
to the other types of brackets in an easy and smart way, at least in java;
in haskell you could provide solution just in one line). What is the 
purpose of this class? We simply try to find a practical application of
CombinationWithRepetitionsGenerator, java8 streams and filter.*
<a name="BalanceParenthesisChecker"></a>
* **BalanceParenthesisChecker**
it's a simplification of BalanceChecker, 
as a brackets map we use ')' & '('.
<a name="MinimalParenthesisFlipToBalance"></a>
* **MinimalParenthesisFlipToBalance**
is a solution to the following problem:  
*What is the minimal number of bracket flips (changing '(' -> ')' and 
vice-versa) to make the string balanced. The most important information
is that after using BalancedPartsRemover we obtain string in the form of
))...)((...( - so the minimal number of flips could be analytically 
calculated.*
<a name="TwoArgumentParenthesisGrouper"></a>
* **TwoArgumentParenthesisGrouper**
is a solution to the following problem:  
*For a given string print all possible groups of its characters in the 
brackets (bracket is treated as a two-argument operator).  
For example:  
ab -> [(ab)]  
abc -> [(a(bc)), ((ab)c)]  
abcd -> [(a(b(cd))), (a((bc)d)), ((ab)(cd)), ((a(bc))d), (((ab)c)d)]*
