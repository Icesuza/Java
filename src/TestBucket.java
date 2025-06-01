import model.Bucket;

class Water{}
class Soil{}
public class TestBucket {
    public static void main(String[] args){
        Bucket<Water> bucket = new Bucket<Water>(new Water());
        System.out.println(bucket.getData());
    }
}
