public boolean makeBricks(int small, int big, int goal) {
    
    int bigBricksNeeded = goal/5;
    int smallBricksNeeded = goal%5;
    
    if(bigBricksNeeded>big){
       smallBricksNeeded+=((bigBricksNeeded-big)*5);
    }
    
    return smallBricksNeeded <= small;
    
}
