package Data_Structure.Linear.HashTable.OpenAddress;

class MakeQuadraticProbing {
    Integer[] table;
    int elementCnt;

    MakeQuadraticProbing() {
    }

    MakeQuadraticProbing(int size) {
        this.table = new Integer[size];
        this.elementCnt = 0;
    }

    public int getHash(int key) {
        return key % this.table.length;
    }

    public void setValue(int key, int data) {
        int idx = this.getHash(key);

        if (this.elementCnt == this.table.length) {
            System.out.println("HashTable is Full");
            return;
        } else if (this.table[idx] == null) {
            this.table[idx] = data;
        } else {
            int cnt = 0;
            int newIdx = idx;
            while (true) {
                newIdx = (newIdx + (int) Math.pow(2, cnt)) % this.table.length;
                if (this.table[newIdx] == null) {
                    break;
                }
                cnt++;
            }
            this.table[newIdx] = data;
        }
        this.elementCnt++;
    }

    public int getValue(int key) {
        int idx = this.getHash(key);
        return this.table[idx];
    }

    public void removeValue(int key) {
        int idx = this.getHash(key);
        this.table[idx] = null;
        this.elementCnt--;
    }

    public void printHashTable() {
        System.out.println("== Hash Table ==");
        for (int i = 0; i < this.table.length; i++) {
            System.out.println(i + ": " + this.table[i]);
        }
    }
}

public class MQuadraticProbing {
    public static void main(String[] args) {
        MakeQuadraticProbing ht = new MakeQuadraticProbing(11);
        ht.setValue(1, 10);
        ht.setValue(2, 20);
        ht.setValue(4, 400);
        ht.printHashTable();

        ht.setValue(1, 100);
        ht.printHashTable();

        ht.setValue(1, 200);
        ht.setValue(1, 300);
        ht.setValue(1, 400);
        ht.printHashTable();
    }
}
