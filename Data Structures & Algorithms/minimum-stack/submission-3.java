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
            if (val < sDup.peek())
            {
                sDup.push(val);
            }
            else
            {
                sDup.push(sDup.peek());
            }
        }
    }
    
    public void pop() {
        s.pop();
        sDup.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return sDup.peek();
    }
}
