# Arrays

- Structures of fixed-size data records such that each element are located by its index
- Example:
  - Imagine a street full of house, where each array element is a house and the index is the house number
    - Assuming all the houses are equal in size and numbered sequentially from 1 to n (n = number of houses), we can get the exact position of each house right away from its address
- Advantages include:
  - Constant-time access given the index
  - Space efficiency, since arrays consist purely of data
  - Memory locality
- Disadvantages include:
  - Unable to adjust the size of an array
- It is possibly to enlarge arrays through utilizing what is known as dynamic arrays
  - Imagine we start with an array of size 1, and double its size from m to 2m each time we run out of space. This doubling process involves allocating a new array of size 2m, copying the contents of the old array to the lower half of the new one, and returning the space used by the old array to the storage allocation system
