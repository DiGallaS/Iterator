import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;


public class Randoms implements Iterable<Integer>{
    protected Random random = new Random();
    protected PrimitiveIterator.OfInt a;

    public Randoms(int min, int max) {

        a = random.ints(min,max+1).iterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return a.nextInt();
            }
        };
    }

}
