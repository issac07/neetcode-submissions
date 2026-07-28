class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> sDup;
    public MinStack() {
        
        s = new Stack<>();
        sDup = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        
        if(sDup.empty())
        {
            sDup.push(val);
        }
        else
        {
            if (val > sDup.peek())
            {
                int t = sDup.pop();
                sDup.push(val);
                sDup.push(t);
            }
            else
            {
                sDup.push(val);
            }
        }
    }
    
    public void pop() {
        sDup.remove(s.pop());
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return sDup.peek();
    }
}
