public class VarageMetod {
    static void getValue(int[]...num){
        for(int[] p:num){
            for (int e: p){
                System.out.println(e);
            }
        }
    }
    static void getNewValue(String name, int ...age){
        System.out.println(name);
        for(int e:age){
            System.out.println(e);
        }
    }
    public static void main(String [] args){
        getValue(new int[][]{{3,5},{3,1}});
        getNewValue("momo",21);
        getNewValue("mimi",30);
    }
}
