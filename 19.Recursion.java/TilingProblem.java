public class TilingProblem {

    public static int tillingWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // // Vertically choice

        // int fnm1 = tillingWays(n - 1);

        // // Horizontally Choice
        // int fnm2 = tillingWays(n - 2);
        // int totWays = fnm1 + fnm2;

        // return totWays;

        // Make in consise ways
        return tillingWays(n - 1) + tillingWays(n - 2);

    }

    public static void main(String[] args) {
        System.err.println(tillingWays(3));
    }
}

// Let's try

// to understand
// the recursive
// tiling problem
// using a real-
// world analogy
// that might
// make the
// concept clearer.

// Real-
// World Analogy:
// Filling a
// Bookshelf Imagine
// you have
// a bookshelf
// that has
// a width
// of 𝑛
// n units.
// You have
// two types
// of books:

// Tall Book:
// This book
// takes up 2
// units of

// space (like placing a tile horizontally).
// Short Book: This book takes up 1 unit of

// space (like placing a tile vertically).
// Now, your task is to fill the entire bookshelf using these books. You want to
// know how many different ways you can arrange these books to fill the
// bookshelf completely.

// Rules:
// If you place a Tall Book, it takes up 2 units of space, leaving you with a
// 𝑛
// −
// 2
// n−2 unit-wide space to fill.
// If you place a Short Book, it takes up 1 unit of space, leaving you with a
// 𝑛
// −
// 1
// n−1 unit-wide space to fill.
// Recursive Thought Process:
// Base Case 1: If the shelf is 0

// units wide (no space left), there is only one way to fill it: do nothing. So,
// ways(0) = 1.
// Base Case 2: If the shelf is 1 unit wide, the only way to fill it is with one
// Short Book. So, ways(1) = 1.
// Recursive Case: If the shelf is
// 𝑛
// n units wide, you have two choices:
// Place a Short Book and solve the problem for
// 𝑛
// −
// 1
// n−1 units.
// Place a Tall Book and solve the problem for
// 𝑛
// −
// 2
// n−2 units.
// Example: Filling a 4-unit Shelf (n = 4)
// Let's walk through how you would fill a 4-unit wide shelf:

// Start with 4 units of space:

// Option 1: Place a

// Short Book (takes 1 unit), leaving 3 units of space.
// Option 2: Place a

// Tall Book (takes 2 units), leaving 2 units of space.
// 3 units of space left:

// Option 1: Place a

// Short Book (takes 1 unit), leaving 2 units of space.
// Option 2: Place a

// Tall Book (takes 2 units), leaving 1 unit of space.
// 2 units of space left:

// Option 1: Place a

// Short Book (takes 1 unit), leaving 1 unit of space.
// Option 2: Place a

// Tall Book (takes 2 units), leaving 0 units of space.
// 1 unit of space left:

// Option 1: Place a

// Short Book (takes 1 unit), leaving 0 units of space.
// 0 units of space left:

// You’ve successfully filled the shelf.
// All Possible Arrangements:
// Short Book + Short Book + Short Book +

// Short Book (all Short Books)
// Tall Book + Short Book +

// Short Book (1 Tall Book + 2 Short Books)
// Short Book + Tall Book +

// Short Book (1 Tall Book + 2 Short Books)
// Short Book + Short Book +

// Tall Book (1 Tall Book + 2 Short Books)
// Tall Book +

// Tall Book (2 Tall Books)
// There are 5 ways to fill a 4-unit shelf, which matches the solution from the
// code.

// Stack Analogy:
// Imagine you have a helper who takes over whenever you decide on an option. If
// you choose to place a Short Book, your helper now has the task of filling the
// remaining space. If they choose a Short Book, they pass the remaining task to
// yet another helper. This continues until a helper ends up with a shelf of 0

// units (no space left). They then start returning back through the chain,
// telling the previous helpers how many ways they found.

// This chain of helpers is like the call stack in recursion. Each helper
// represents a function call that’s waiting to know how many ways there are to
// fill the remaining shelf. Once all the helpers know their parts, the original
// you (the first function call) knows the total number of ways.

// Summary:
// The recursive function explores all possible ways of filling the bookshelf
// (or tiling the board). Each time it makes a choice, it calls itself with the
// remaining problem size until it reaches the base case (no space left). This
// real-world analogy helps you see how recursion works by breaking down the
// problem into smaller and smaller tasks, just like filling smaller and smaller
// portions of the bookshelf.