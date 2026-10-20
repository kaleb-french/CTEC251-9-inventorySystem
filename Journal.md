# Journal
Write your Journal questions and notes here.

Phase 1-
We want to have these default hooks so the method stack between Leafs and Compnents are uniform. This way they can be used in the code interchangaby, this helps with things like recursive traversal. By giving a exception you are letting the client know they are using it on a leaf instead of a compnent.

Phase 2-
We created the compnent for our tree structure the bag and gave it methods to preform traversal of the tree. Polymorphism allows all of the Compnents be treated interchangaby without casting, this allows the methods to call on other Compnents and leaves stored in the array to complete the task by calling the same method on each.
