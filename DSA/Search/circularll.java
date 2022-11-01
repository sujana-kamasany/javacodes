
static Node addAfter(Node last, int data, int item)
{
	if (last == null)
		return null;

	Node temp, p;
	p = last.next;
	do {
		if (p.data == item) {
			temp = new Node();
			temp.data = data;
			temp.next = p.next;
			p.next = temp;

			if (p == last)
				last = temp;
			return last;
		}
		p = p.next;
	} while (p != last.next);

	System.out.println(item + " not present in the list.");
	return last;
}

