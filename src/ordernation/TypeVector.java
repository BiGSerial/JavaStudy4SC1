package ordernation;

import data.Item;

public class TypeVector {
	
	 private Item [] vector;
	 private int nElem;
	
	public TypeVector (int size)
	{
		this.vector = new Item[size];
		this.nElem = 0;
	}
	
	public int getnElem() {
		return this.nElem;
	}
	
	public void setnElem(int nElem) {
		this.nElem = nElem;
	}
	
	public boolean insertData(Item newItem) {
		if (this.nElem == this.vector.length) {
			return false;
		} else {
			this.vector[this.nElem] = newItem;
			this.nElem++;
			return true;
		}
	}
	
	public void directSelection() {
        int i, j, minimo;
        Item temp;
        
        for (i = 0; i < this.nElem - 1; i++) {
            minimo = i;
            
            for (j = i + 1; j < this.nElem; j++) {
                if (this.vector[j].getChave() < this.vector[minimo].getChave()) {
                    minimo = j;
                }
            }
            
            if (minimo != i) {
                temp = this.vector[minimo];
                this.vector[minimo] = this.vector[i];
                this.vector[i] = temp;
            }
        }
	}
	
	public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nElem; i++) {
            sb.append('[').append(vector[i].getChave()).append(']');
        }
        return sb.toString();
    }
}
