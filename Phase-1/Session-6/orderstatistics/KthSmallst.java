package com.simplilearn.orderstatistics;

class KthSmallst {
	
	int kthSmallest(int arr[], int l, int r, int k) {
		
		if (k > 0 && k <= r - l + 1) {
			int pos = randomPartition(arr, l, r);
			if (pos - l == k - 1)
				return arr[pos];//if the index is same as k  then we found the smallest element
			if (pos - l > k - 1)//if index of partitioned element is more then k, then recur for left part,
				return kthSmallest(arr, l, pos - 1, k);
				//changed right=pos-1
			
			return kthSmallest(arr, pos + 1, r, k - pos + l - 1); 
			//if index is less that k then recur only its right part
			//changed left= pos+1
		}
		return Integer.MAX_VALUE;
	}

	void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//adjust value in ascending order
	int partition(int arr[], int l, int r) {
		int x = arr[r], i = l;
		for (int j = l; j <= r - 1; j++) {
			if (arr[j] <= x) {
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, r);
		return i; //return index
	}

	//partition
	int randomPartition(int arr[], int l, int r) {
		int n = r - l + 1; //length of array
		int pivot = (int) (Math.random()) * (n - 1);
		swap(arr, l + pivot, r);
		return partition(arr, l, r);
	}
}