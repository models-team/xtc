/* test analyzer, expected to pass*/

extern __inline__ int
odd(int i)
{
  return i & 0x1;
}

int
foo(int i, int j)
{
  return odd(i + j);
}

int
odd(int i)
{
  return i & 0x1;
}

