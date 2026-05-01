package Learning.Recursion;

class Pattern {
    static void printRevTriangle(int n) {
        String s = "";
        for(int i=0;i<n;i++){
            s+="* ";
        }
        System.out.println(s);
        if(n>1) printRevTriangle(n-1);

        return;
    }
    public static void main(String args[]){
        printRevTriangle(5);
    }
}