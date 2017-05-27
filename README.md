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
│   ├── problems.arrays
│   │   ├── CyclicRotation
│   │   ├── ExtremeArrayValues
│   │   ├── PermCheck
│   ├── problems.brackets
│   │   ├── BalanceChecker
│   │   ├── BalancedParenthesisGenerator
│   │   ├── BalancedPartsRemover
│   │   ├── BalanceParenthesisChecker
│   │   ├── MinimalParenthesisFlipToBalance
│   │   ├── ParenthesiseMatrixChainToMinimiseMultiplications
│   │   ├── TwoArgumentParenthesisGrouper
│   ├── problems.dates
│   │   ├── DateGenerator
│   │   ├── DatePeriod
│   │   ├── DatePeriodFactory
│   │   ├── DatePeriodGenerator
│   │   ├── DatePeriodPairIntersectionChecker
│   │   ├── DatePeriodsMerger
│   │   ├── DatePeriodsSorter
│   │   ├── EveryPairOfDatePeriodHasEmptyIntersection
│   ├── problems.duplicates
│   │   ├── DuplicatesRemover
│   │   ├── FindMissingIntInShuffledArithmeticSequence
│   │   ├── FindUniqueIntInAnArrayOfTwins
│   │   ├── IntegerDuplicatesRemover
│   │   ├── IntegerOccurrencesCounter
│   │   ├── OccurrencesCounter
│   ├── problems.iterators
│   │   ├── IterablesMerger
│   │   ├── IteratorsComparator
│   ├── problems.maps
│   │   ├── LinkedMapsComparator
│   │   ├── MapPrinter
│   │   ├── MapSorter
│   ├── problems.pecs
│   │   ├── controller
│   │   │   ├── ReportController
│   │   ├── dao
│   │   │   ├── BasicReportDAO
│   │   │   ├── ExtendedReportDAO
│   │   │   ├── FleetReportDAO
│   │   ├── reports
│   │   │   ├── BasicReport
│   │   │   ├── ExtendedReport
│   │   │   ├── FleetReport
│   │   │   ├── Report
│   │   ├── DatabaseMock
│   ├── problems.primes
│   │   ├── CountPrimes
│   │   ├── Sieve
│   │   ├── SumPrimes
```

### links
**[drawers.string](#drawers.string)**  
-- [Saw1Drawer](#Saw1Drawer)  
-- [Saw2Drawer](#Saw2Drawer)  
-- [Saw3Drawer](#Saw3Drawer)  
-- [SawDrawer](#SawDrawer)  
-- [SawDrawerFactory](#SawDrawerFactory)  
**[problems.arrays](#problems.arrays)**  
-- [CyclicRotation](#CyclicRotation)  
-- [PermCheck](#PermCheck)  
**[problems.brackets](#problems.brackets)**  
-- [BalanceChecker](#BalanceChecker)  
-- [BalancedParenthesisGenerator](#BalancedParenthesisGenerator)  
-- [BalancedPartsRemover](#BalancedPartsRemover)  
-- [BalanceParenthesisChecker](#BalanceParenthesisChecker)  
-- [MinimalParenthesisFlipToBalance](#MinimalParenthesisFlipToBalance)  
-- [ParenthesiseMatrixChainToMinimiseMultiplications](#ParenthesiseMatrixChainToMinimiseMultiplications)  
-- [TwoArgumentParenthesisGrouper](#TwoArgumentParenthesisGrouper)  
**[problems.dates](#problems.dates)**  
-- [DateGenerator](#DateGenerator)  
-- [DatePeriod](#DatePeriod)  
-- [DatePeriodFactory](#DatePeriodFactory)  
-- [DatePeriodGenerator](#DatePeriodGenerator)  
-- [DatePeriodPairIntersectionChecker](#DatePeriodPairIntersectionChecker)  
-- [DatePeriodsMerger](#DatePeriodsMerger)  
**[problems.duplicates](#problems.duplicates)**  
-- [DuplicatesRemover](#DuplicatesRemover)  
-- [FindMissingIntInShuffledArithmeticSequence](#FindMissingIntInShuffledArithmeticSequence)  
-- [FindUniqueIntInAnArrayOfTwins](#FindUniqueIntInAnArrayOfTwins)  
-- [OccurrencesCounter](#OccurrencesCounter)  
**[problems.iterators](#problems.iterators)**  
-- [IterablesMerger](#IterablesMerger)  
-- [IteratorsComparator](#IteratorsComparator)  
**[problems.maps](#problems.maps)**  
-- [LinkedMapsComparator](#LinkedMapsComparator)  
-- [MapSorter](#MapSorter)  
**[problems.pecs](#problems.pecs)**  
-- [ReportController](#ReportController)  
**[problems.primes](#problems.primes)**  
-- [CountPrimes](#CountPrimes)  
-- [Sieve](#Sieve)  
-- [SumPrimes](#SumPrimes)  

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
<a name="problems.arrays"></a>
## problems.arrays

<a name="CyclicRotation"></a>
* **CyclicRotation**
is a solution to the following problem:  
*For the given array and shiftOrder move all elements to the right by 
shiftOrder places.  
For example:  
1) array = (1,2,3,4,5,6), order = 3 -> (4,5,6,1,2,3)  
2) array = (1,2,3,4,5,6), order = 2 -> (5,6,1,2,3,4).*

<a name="PermCheck"></a>
* **PermCheck**
is a solution to the following problem:  
*Check if the given array is a permutation of some consecutive integers
set.  
For example: (2,1,4,3,5) is a permutation of (1,2,3,4,5), but (2,1,3,5)
is not permutation of any consecutive integers set -> number 4 is 
missing.*

<a name="problems.brackets"></a>
## problems.brackets

<a name="BalanceChecker"></a>
* **BalanceChecker**
is a solution to the following problem:  
*For the given string and brackets map decide if string is balanced. It's
easier to show examples of balanced and unbalanced strings than giving
exact and precise definition, so:  
(()(()()))() - is *balanced*  
()))() - is *unbalanced*  
solution is construct using the stack structure.*
<a name="BalancedParenthesisGenerator"></a>
* **BalancedParenthesisGenerator**
is a solution to the following problem:  
*For the given number of pairs, generate all possible balanced 
brackets '(' & ')'. It's very important to have a good approach to such
tasks - producing all possible combinations of '(' & ')' and then filtering
which combination is balanced is a very poor and naive solution - 
we decide to choose different way: construct solution by recursion.*  
<span style="color:red">Remark: we have invented interesting approach to
test results; usage of CatalanNumbers enables us to test practically 
any given length.</span>
<a name="BalancedPartsRemover"></a>
* **BalancedPartsRemover**
is a solution to the following problem:  
*From the given string containing only '(' & ')' remove all balanced (in 
sense of BalanceChecker) parts.  
For example: )((()())())))((( -> )))(((  
Solution is construct using the 
<span style="color:blue">stack structure</span>.*  
<span style="color:red">Remark: after removing all balanced 
parts we get a string: ))...n...)(...m...((,  
where n & m are the number 
of brackets ')' & '(' respectively.</span>
<a name="BalanceParenthesisChecker"></a>
* **BalanceParenthesisChecker**
it's a simplification of BalanceChecker, 
as a brackets map we use ')' & '('.
<a name="MinimalParenthesisFlipToBalance"></a>
* **MinimalParenthesisFlipToBalance**
is a solution to the following problem:  
*What is the minimal number of bracket flips (changing '(' -> ')' and 
vice-versa) to make the string balanced.*  
<span style="color:red">Remark: after using BalancedPartsRemover we obtain string in the form of
))...)((...( - so the minimal number of flips could be analytically 
calculated.</span>
<a name="TwoArgumentParenthesisGrouper"></a>
* **TwoArgumentParenthesisGrouper**
is a solution to the following problem:  
*For a given string print all possible groups of its characters in the 
brackets (bracket is treated as a two-argument operator).  
For example:  
ab -> [(ab)]  
abc -> [(a(bc)), ((ab)c)]  
abcd -> [(a(b(cd))), (a((bc)d)), ((ab)(cd)), ((a(bc))d), (((ab)c)d)]*  
<span style="color:red">Remark: we have invented interesting approach to
test results; usage of CatalanNumbers enables us to test practically 
any given length.</span>

<a name="problems.dates"></a>
## problems.dates

<a name="DateGenerator"></a> 
* **DateGenerator** generates random dates in a range approximately 
*(now-3,5 year; now+3,5)*. To control scope we use parameter *upperBound*, 
which is interpreted as maximal number of milliseconds to add or to subtract).
<a name="DatePeriod"></a>
* **DatePeriod** is a date interval of type *<dateFrom; dateTo>*. To 
enforce correct behaviour we use private constructor and introduce 
<a name="DatePeriodFactory"></a> **DatePeriodFactory** where we perform
appropriate validations (*dateFrom* has to be not null & 
*dateFrom <= dateTo*, null *dateTo* is interpreted as infinity). 
Moreover, we assume that *DatePeriod* is a closed interval (each end 
belongs to interval).
<a name="DatePeriodGenerator"></a>
* **DatePeriodGenerator** generates random well-formed (in sense of the 
time sequence) *DatePeriods*.
<a name="DatePeriodPairIntersectionChecker"></a>
* **DatePeriodPairIntersectionChecker** is a solution to the following 
problem:  
*For a given pair *(DatePeriod1; DatePeriod2)* decide if intersection is 
empty.*
<a name="DatePeriodsMerger"></a>
* **DatePeriodsMerger** is a solution to the following problem:  
*For a given ArrayList of DatePeriods merge all overlapping elements.*

<a name="problems.duplicates"></a>
## problems.duplicates
Main reason of implementing this package is to show how to deal with 
java generics concept - we try to expose its versatility and power, for 
example by writing generics tests. We want to present some java8 
features that are quite natural and very helpful in solving similar 
problems.
<a name="DuplicatesRemover"></a>
* **DuplicatesRemover** the most important thing in solving this problem
is to use *LinkedHashSet* instead of *HashSet*, because there is no 
guarantee that the *HashSet* maintains order. Not using *LinkedHashSet*
is a most frequent flaw in an approach to such problems.
<a name="FindUniqueIntInAnArrayOfTwins"></a>
* **FindUniqueIntInAnArrayOfTwins** it's one of my favourite questions
from the interviews. This problem could be solved without additional 
counting of elements and extra need of memory - we just use XOR.  
More challenging question is how to find unique int in an array of 
triplets and, more generally, in an array of any-prime-number 
repetitions (very hard).
<a name="FindMissingIntInShuffledArithmeticSequence"></a>
* **FindMissingIntInShuffledArithmeticSequence** is a solution
to the following problem:  
*For a given int sequence shuffle(1,2,...,k-1,k+1...,n) find the missing 
int k.  
Remark: it's crucial to have a proper way of attacking such questions - 
by using XOR we should reduce this issue to the solved problem 
right above (FindUniqueIntInAnArrayOfTwins):  
(1,...,n) XOR shuffle(1,2,...,k-1,k+1...,n) = k.  
**Remark:** it's very easy to extend that approach to every array 
containing arithmetic sequence starting at given int - and we, indeed, 
have shipped that extension.  
**Remark:** The worst way of solving that problem is by evaluating sum of all ints
1 ... n = (1 + n / 2) * n then subtracting sum of all elements from the 
given array. However the answer will be wanted k, but we could easily 
extend the int range (take for example sequence (2147483640, 2147483642)
obviously 2147483641 is missing, but the range during summing will be 
exceeded).*
<a name="OccurrencesCounter"></a>
* **OccurrencesCounter** it's simply java8 features and generics 
showcase.  

<a name="problems.iterators"></a>
## problems.iterators

<a name="IterablesMerger"></a>
* **IterablesMerger** is a solution to the
following problem:  
*We have N Iterables: A1,A2,...,AN. Provide an merged iterator enabling 
us to traverse content of union A1,A2,...,AN in a following order: 
first - all elements of A1, then all elements of A2, ..., finally all 
elements of AN.  
For example:  
A1=[1->2->3], A2=[4->5], A3=[6->7];  
result: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7.*  

<a name="IteratorsComparator"></a>
* **IteratorsComparator** is a solution to the
following problem:  
*Two Iterators are equal then and only then if they represent the same 
elements in the same order and the same length (the same number of 
elements)*  

<a name="problems.maps"></a>
## problems.maps

<a name="LinkedMapsComparator"></a>
* **LinkedMapsComparator** is a solution to the following problem:  
*For given two linkedHashMaps: A and B, compare not only elements but also
order. The default equals in LinkedHashMap comes from AbstractMap, so 
it's useless.*
<a name="MapSorter"></a>
* **MapSorter** is a solution to the following problem:  
*For a given map A<K, V>, where V extends Comparable<V>, sort A by 
values using java 8 api. We provide much more flexible solution - we 
sort map A with any legitimate comparator of entries.   
We have to return LinkedHashMap - it's the only
way of providing correct entry order.*

<a name="problems.pecs"></a>
## problems.pecs
*PECS (Producer Extends Consumer Super) it's a mnemonic principle 
firstly described by Joshua Bloch in a book Effective Java. The PECS 
rule states good practices of using wildcards, for example - in APIs 
design.  
I found out PECS principle when I was searching the Internet for the 
answer to the following apparent inconsistency:  
Why in the Collections class we have:  
addAll(Collection<**? super T**> c, T... elements)  
while in the Collection we have:  
addAll(Collection<**? extends E**> c).*
<a name="ReportController"></a>
* **ReportController**:  in this class, we have three similar methods, so
we are going to describe only one of them:  
addBasicReports(Collection<**? super BasicReport**> c, 
Collection<**? extends BasicReport**> elements).
In above declaration, **c** is consumer and **elements** are producers.

<a name="problems.primes"></a>
## problems.primes

<a name="CountPrimes"></a>
* **CountPrimes** is a solution to the following problem:  
*For a given closed interval <lowerBound; upperBound> count prime 
numbers.  
For example:  
<2; 3> -> 2,  
<2; 5> -> 3,  
<2; 7> -> 4,  
<2; 11> -> 5.  
First step of solving is to generate sieve of Erastotenes (every prime 
is marked as true, every composite as false), then we propagate sum 
through the array, to obtain:  
[0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1] -> 
[0, 0, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6].  
After that to have number of primes in the interval <a; b> we have to 
only subtract: sieve[b] - sieve[a-1]. Every other approach that 
presented above is either wasting memory or multiple evaluation of once 
computed values.*
<a name="Sieve"></a>
* **Sieve** is an implementation of 
[Erastotenes' sieve](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)
.
<a name="SumPrimes"></a>
* **SumPrimes** is a solution to the following problem:  
*For a given closed interval <lowerBound; upperBound> sum all prime 
numbers.  
To solve it in the most optimal way, we use the same idea as in 
**CountPrimes**.*

# TODO
<a name="ParenthesiseMatrixChainToMinimiseMultiplications"></a>
* **ParenthesiseMatrixChainToMinimiseMultiplications** will be a 
solution to the following problem:  
[Description on wikipedia](https://en.wikipedia.org/wiki/Matrix_chain_multiplication)  
*Given a sequence of matrices, find the most efficient way to multiply 
these matrices.  
For example:  
consider matrices: A=10x30, B=30x5, C=5x60  
computing (AB)C needs (10×30×5) + (10×5×60) = 1500 + 3000 = 4500 
operations, while  
computing A(BC) needs (30×5×60) + (10×30×60) = 9000 + 18000 = 27000 
operations, so we chose (AB)C.  
Before above task: write evaluator of matrix chain expressions in sense 
of number of multiplications and then filter the list of all possible 
balanced parenthesis to find minimum.*
* **NestedLevelOfElementInAListOfLists** will be solution to the following 
problem:  
*For a given list A of lists A1,A2,...,AN (Ak could be also a list of 
lists) return the nested level of given element.*
