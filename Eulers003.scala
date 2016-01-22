idef factor(x:Long, y:Long):Long ={
    if(y%x == 0) factor(2,y/x)
    else if (x >math.sqrt(y)) y
    else  factor(x+1, y)
  }

factor(2l, 13195)

