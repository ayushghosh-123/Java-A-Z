# Garbage Collector

Garbage collection is an automatic "clean-up crew" for Java's memory. When you create objects in a program, they take up space. The Garbage Collector's job is to find objects that are no longer being used and get rid of them to free up that space.

## 👍Here’s how it works in simple steps:

`Finding Unused Objects`: The Garbage Collector checks which objects are still connected to the running program. Anything that is not connected (like an old object you've finished with) is marked for deletion.

`Deleting`: It then deletes all the unused objects, making that memory available for new objects.

`Organizing (Sometimes)`: It may also tidy up the remaining objects, moving them closer together so there are no gaps in the memory.

This automatic process prevents common problems like running out of memory and makes programming in Java much simpler and safer.

🌟 NOTE -
---
when object is delete from the memory java call the garbage colllector and finalized .