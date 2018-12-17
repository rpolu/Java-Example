package com.ram.ds;

public class ArrayList<T> {
	private Object[] objs;
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 8683452581122892189L;

	private static final int DEFAULT_CAPACITY = 10;

	private int size;

	public ArrayList() {
		this.objs = new Object[DEFAULT_CAPACITY];
	}

	public boolean add(T data) {
		objs[size++] = data;
		return true;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		T t = (T) objs[index];
		return t;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		int i = 1;
		for (Object ob : objs) {
			sb.append(ob);
			if (i == size) {
				return sb.append("]").toString();
			}
			sb.append(",");
			i++;
		}
		sb.append("]");
		return sb.toString();
	}

	public T remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		@SuppressWarnings("unchecked")
		T ob = (T) objs[index];
		for (int i = index; i < size; i++) {
			objs[i] = objs[i + 1];
		}
		objs[--size] = null;
		return ob;
	}

	public void add(int index, T data) {
		if (index > size) {
			throw new IndexOutOfBoundsException();
		}
		Object temp = data;
		for (int i = index; i <= size; i++) {
			Object current = objs[i];
			objs[i] = temp;
			temp = current;
		}
		size++;

	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		al.add(1, 56);
		System.out.println(al);
		al.add(0, 56);
		System.out.println(al);
		al.add(5, 90);
		System.out.println(al);

	}

}
