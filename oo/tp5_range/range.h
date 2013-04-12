#ifndef _RANGE_H
#define _RANGE_H

#include "arithmetix.h"

template<class T>
class Range
{
private:
	bool empty;
	T lbound, rbound;
	
public:
	Range() : 
		empty(true) 
	{

	}

	Range(T lbound, T rbound) : 
		empty(false),
		lbound(lbound),
		rbound(rbound)
	{

	}
	inline bool IsEmpty() const
	{
		return this->empty;
	}
	bool Contains(T val) const
	{
		return !this->IsEmpty()
			&&!(val<this->lbound)
			&&!(this->rbound<val);
	}
	Range Merge(const Range& other) const
	{
		if(this->IsEmpty())
			return other;
		else if(other.IsEmpty())
			return *this;
		else
			return Range(
				Min(this->lbound, other.lbound), 
				Max(this->rbound, other.rbound)
			); 
	}
	Range Intersect(const Range &other) const
	{
		if(!this->IsEmpty()&&!other.IsEmpty())
		{
			T newlbound(Max(this->lbound, other.lbound)),
			  newrbound(Min(this->rbound, other.rbound));

			if(!(newrbound<newlbound))
				return Range(newlbound, newrbound);
		}
		return Range();
	}
	bool operator==(const Range &other) const
	{
		return this->IsEmpty()&&other.IsEmpty()
			|| (this->lbound==other.lbound && this->rbound==other.rbound);
	}

};

#endif
