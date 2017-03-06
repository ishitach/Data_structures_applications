

Node MergeLists(Node a, Node b) {

    if (a == null){
        return b;
    }
    if (b == null){
        return a;
    }
    if (a.data < b.data){
        a.next = MergeLists(a.next, b);
        return a;
    }
    else {
        b.next = MergeLists(a, b.next);
        return b;
    }
}
