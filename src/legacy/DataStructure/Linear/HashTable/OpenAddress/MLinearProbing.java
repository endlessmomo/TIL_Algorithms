package legacy.DataStructure.Linear.HashTable.OpenAddress;


class MakeLinearProbing {
    Integer[] table;
    int elementCnt;

    MakeLinearProbing() {
    }

    MakeLinearProbing(int size) {
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
            int newIdx = idx;
            while (true) {
                newIdx = (newIdx + 1) % this.table.length;
                if (this.table[newIdx] == null) {
                   break;
                }
            }
            this.table[newIdx] = data;
        }
        elementCnt++;
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

public class MLinearProbing {
    public static void main(String[] args) {
        MakeLinearProbing ht = new MakeLinearProbing(5);
        ht.setValue(1,1);
        ht.setValue(3,3);
        ht.printHashTable();

        ht.setValue(1, 10);
        ht.printHashTable();

        ht.setValue(1,40);
        ht.setValue(1,50);
        ht.printHashTable();
        ht.setValue(1,7);
    }
}
