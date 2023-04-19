package DataStructure.Linear.HashTable.OpenAddress;

class MakeDoubleHashing {
    Integer[] table;
    int elementCnt;
    int c;

    MakeDoubleHashing() {
    }

    MakeDoubleHashing(int size) {
        this.table = new Integer[size];
        this.elementCnt = 0;
        this.c = this.getHashC(size);
    }

    public int getHash(int key) {
        return key % this.table.length;
    }

    public int getHashC(int size) {
        int c = 0;

        if (size <= 2) {
            return size;
        }

        for (int i = size - 1; i > 2; i--) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                c = i;
                break;
            }
        }
        return c;
    }

    public int getHash2(int key) {
        int hash = 1 + key % this.c;
        return hash;
    }

    public void setValue(int key, int data) {
        int idx = this.getHash(key);

        if (this.elementCnt == this.table.length) {
            System.out.println("HahTable is full!");
            return ;
        } else if (this.table[idx] == null){
            this.table[idx] = data;
        } else {
            int newIdx = idx;
            int cnt = 1;
            while(true){
                newIdx = (newIdx + this.getHash2(newIdx) * cnt) % this.table.length;
                if(this.table[newIdx] == null){
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

public class MDoubleHashing {
    public static void main(String[] args) {
        // Test Code
        MakeDoubleHashing ht = new MakeDoubleHashing(11);

        ht.setValue(1, 10);
        ht.setValue(2, 20);
        ht.setValue(3, 30);
        ht.printHashTable();

        ht.setValue(1, 100);
        ht.setValue(1, 200);
        ht.setValue(1, 300);
        ht.printHashTable();
    }
}
