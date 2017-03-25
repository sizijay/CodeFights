boolean almostIncreasingSequence(int[] sequence) {
    int t=0;
    int x;
    int[] a = sequence;
    int[] tmp = new int[sequence.length-1];
    for(int j=0;j<sequence.length-1;j++){
        x=0;
        t=0;
        for(int i=0;i<sequence.length;i++){
            if(i!=j){
                tmp[x]=a[i];
                x++;
            }
        }
        for(int k=0;k<tmp.length-1;k++){
            if(tmp[k]>=tmp[k+1]){
                t=1;
                break;
            }
        }
        if(t==0){
            return true;
        }
