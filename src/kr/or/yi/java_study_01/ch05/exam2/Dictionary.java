package kr.or.yi.java_study_01.ch05.exam2;

class Dictionary extends PairMap {
	private int length;
	private int size;

	public Dictionary() {
		// TODO Auto-generated constructor stub
	}

	public Dictionary(int size) {
		this.size = size;
		this.KeyArray = new String[size];
		this.ValueArray = new String[size];
	}

	private int findKeyIndex(String key) {
		for (int i = 0; i < KeyArray.length && KeyArray[i] != null; i++) {
			if (KeyArray[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	String get(String key) {
		int getIdx = findKeyIndex(key);
		if (getIdx == -1) {
			return null;
		}
		return this.ValueArray[getIdx];
	}

	@Override
	void put(String key, String value) {
		int putIdx = findKeyIndex(key);
		if (putIdx == -1) {
			this.KeyArray[length] = key;
			this.ValueArray[length] = value;
			length = length + 1;
		} else {
			this.ValueArray[putIdx] = value;
		}
	}

	@Override
	String delete(String key) {
		int delIdx = findKeyIndex(key);
		if (delIdx == -1) {
			System.out.println("삭제할 키가 존재하지 않음");
			return null;
		}
		String value = this.ValueArray[delIdx];
		this.KeyArray[delIdx] = null;
		this.ValueArray[delIdx] = null;

		this.KeyArray = reOrder(delIdx, KeyArray);
		this.ValueArray = reOrder(delIdx, ValueArray);
		return value;
	}

	private String[] reOrder(int delIdx, String[] keyArray) {
		String[] tempArray = new String[size];
		System.arraycopy(keyArray, 0, tempArray, 0, delIdx);
		System.arraycopy(keyArray, delIdx + 1, tempArray, delIdx, keyArray.length - delIdx - 1);
		this.KeyArray = tempArray;
		return tempArray;
	}

	@Override
	int length() {
		return length;
	}

}
