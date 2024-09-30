public class StringBufferDemo {
    public static void main(String[] args) {
        // Create a StringBuffer with an initial capacity of 5 characters
        StringBuffer sb = new StringBuffer(5);  
        
        // Append some characters to the buffer
        sb.append("Hello");
        System.out.println("Buffer: " + sb);
        System.out.println("Buffer Capacity after 'Hello': " + sb.capacity()); // Initial capacity: 5
        
        // Append more characters, which will cause the buffer to grow
        sb.append(" World");
        System.out.println("Buffer after append ' World': " + sb);
        System.out.println("Buffer Capacity after append: " + sb.capacity()); // Buffer grows to accommodate new characters
        
        // Insert characters at a specific position
        sb.insert(5, ",");
        System.out.println("Buffer after insert ',': " + sb);

        // Delete characters from the buffer
        sb.delete(5, 6);  // Removes the comma
        System.out.println("Buffer after delete ',': " + sb);

        // Reverse the buffer
        sb.reverse();
        System.out.println("Buffer after reverse: " + sb);
        
        // Accessing a character at a specific index
        System.out.println("Character at index 3: " + sb.charAt(3));
        
        // Checking the capacity
        System.out.println("Final Buffer Capacity: " + sb.capacity());
    }
}