package comparable;

public class Thing implements Comparable {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Object o) {
        Thing otherIsCompleted = (Thing) o;
        if(!this.completed && otherIsCompleted.completed){
            return 1;
        }
        return -1;
    }
}
