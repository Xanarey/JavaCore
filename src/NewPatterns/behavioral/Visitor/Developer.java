package NewPatterns.behavioral.Visitor;

public interface Developer {
    void create(ProjectClass projectClass);

    void create(DateBase dateBase);

    void create(Test test);
}
