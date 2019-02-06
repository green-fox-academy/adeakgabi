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
        Thing otherThing = (Thing) o;
        if(!this.completed && otherThing.completed){
            return 1;
        }
        if(this.completed ^ !otherThing.completed){
            /*for (int i = 0; i < this.name.length() ; i++) {
                if(this.name.charAt(i) < otherThing.name.charAt(i)){
                    return -1;
                } else if(this.name.charAt(i) > otherThing.name.charAt(i)){
                    return 1;
                }
            } */
            return this.name.compareTo(otherThing.name);
        }
        return -1;
    }
}
