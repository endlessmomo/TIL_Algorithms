package legacy.DataStructure.Linear.HashTable;

class MakeHashTable {
    Integer[] table;
    int elementCnt;

    MakeHashTable() {
    }

    MakeHashTable(int size) {
        this.table = new Integer[size];
        this.elementCnt = 0;
    }

    public int getHash(int key) {
        return key % this.table.length;
    }

    public void setValue(int key, int data) {
        int idx = this.getHash(key);
        this.table[idx] = data;
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
        for(int i = 0; i < this.table.length; i++) {
            System.out.println(i + ": " + this.table[i]);
        }
    }
}

public class MHashTable {
    public static void main(String[] args) {
        MakeHashTable ht = new MakeHashTable(7);

        ht.setValue(1,1);
        ht.setValue(2,2);
        ht.setValue(3,3);
        ht.setValue(4,4);
        ht.setValue(5,5);
        ht.printHashTable();

        ht.setValue(8,6);
        ht.printHashTable();
    }
}
