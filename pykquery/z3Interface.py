import z3
# https://ericpony.github.io/z3py-tutorial/advanced-examples.htm
# https://ericpony.github.io/z3py-tutorial/guide-examples.htm
"""
  a[i]             # select array 'a' at index 'i'
                   # Select(a, i)
  
  Store(a, i, v)   # update array 'a' with value 'v' at index 'i'
                   # = Lambda(j, If(i == j, v, a[j]))
    
  K(D, v)          # constant Array(D, R), where R is sort of 'v'.
                   # = Lambda(j, v)
  
  Map(f, a)        # map function 'f' on values of 'a'
                   # = Lambda(j, f(a[j]))

  Ext(a, b)        # Extensionality
                   # Implies(a[Ext(a, b)] == b[Ext(a, b)], a == b)
s.add(Store(a, i, v)[j] == If(i == j, v, a[j]))
s.add(Store(a, i, v)[i] == v)
"""

# Creating bit-vector constants
# a = BitVecVal(-1, 16)
# b = BitVecVal(65535, 16)
# print simplify(a == b)

# # Use I as an alias for IntSort()
# I = IntSort()
# # A is an array from integer to integer
# A = Array('A', I, I)
# x = Int('x')
# print A[x]
# print Select(A, x)
# print Store(A, x, 10)
# print simplify(Select(Store(A, 2, x+1), 2))

if __name__ == "__main__":
    solver = z3.Solver()
    arr1 = z3.Array('arr1', z3.BitVecSort(32), z3.BitVecSort(8))
    arr_1 = z3.Array('arr_1', z3.BitVecSort(32), z3.BitVecSort(8))
    arr_2 = z3.Array('arr_2', z3.BitVecSort(32), z3.BitVecSort(8))
    arr_3 = z3.Array('arr_3', z3.BitVecSort(32), z3.BitVecSort(8))
    const_arr1 = z3.Array('const_arr1', z3.BitVecSort(32), z3.BitVecSort(8))
    pivot03 = z3.Array('pivot03', z3.BitVecSort(32), z3.BitVecSort(8))
    pivot23 = z3.Array('pivot23', z3.BitVecSort(32), z3.BitVecSort(8))
    solver.add(const_arr1[0] == 0)
    solver.add(const_arr1[1] == 0)
    solver.add(const_arr1[2] == 0)
    solver.add(const_arr1[3] == 0)
    solver.add(pivot03[0] >= 0)
    solver.add(pivot03[0] <= 3)
    solver.add(pivot23[0] >= 2)
    solver.add(pivot23[0] <= 3)
        
    print(solver.check())
    print(solver.model())