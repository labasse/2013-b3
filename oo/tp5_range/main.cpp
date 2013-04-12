#include <assert.h>
#include "range.h"

int main()
{
	Range<int> 
		a(2.3, 4.5), 
		b(3.7, 7.2), 
		c(5.1, 6.4),
		
		merge_b_a(2.3, 7.2),
		merge_a_c(2.3, 6.4),
		merge_b_c(3.7, 7.2),
		
		inter_b_a(3.7, 4.5),
		inter_a_c,
		inter_b_c(5.1, 6.4);

	assert(merge_b_a == b.Merge(a));
	assert(merge_a_c == a.Merge(c));
	assert(merge_b_c == b.Merge(c));

	assert(inter_b_a == b.Intersect(a));
	assert(inter_a_c == a.Intersect(c));
	assert(inter_b_c == b.Intersect(c));
	
	return 0;
}
