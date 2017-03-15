import numpy as np
from time import time

m = np.zeros( (1000,1000) )

print "Hadamard:"
mSum = 0
for i in range(10):
    startTime = time()
    np.dot(m,m)
    endTime = time() - startTime
    print str(i+1) + ". Runde:\t" + str(endTime * 1000) + "ms"
    mSum += endTime * 1000
print "Durchschnitt:\t" + str(mSum/10) + "ms"

print "\nMatrizen:"
mSum = 0
for i in range(10):
    startTime = time()
    np.zeros( (1000,1000) )
    endTime = time() - startTime
    print str(i+1) + ". Runde:\t" + str(endTime * 1000) + "ms"
    mSum += endTime * 1000
print "Durchschnitt:\t" + str(mSum/10) + "ms"