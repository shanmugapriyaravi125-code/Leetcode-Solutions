/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* targetIndices(int* a, int n, int t, int* returnSize) {
 int i,j,c,p=0 ;
 int*b=(int*)malloc(n*sizeof(int));  
for(i=0;i<n;i++)
for(j=i+1;j<n;j++)
  if(a[i]>a[j])
  {
    c=a[i];
    a[i]=a[j];
    a[j]=c;
  }
for(i=0;i<n;i++)
  if(a[i]==t)
   b[p++]=i;
   *returnSize=p;
return b;
}