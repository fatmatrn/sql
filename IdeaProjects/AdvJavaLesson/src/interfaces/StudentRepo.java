package interfaces;

public class StudentRepo implements Repository<Student>{
    @Override
    public void add(Student student) {
        System.out.println(student.getName()+" başarıyla kaydedildi.");
    }

    @Override
    public void get(Student student) {
        System.out.println(student.getName()+" başarıyla bulundu.");
    }

    @Override
    public void update(Student student) {
        System.out.println(student.getName()+" başarıyla güncellendi.");

    }

    @Override
    public void delete(Student student) {
        System.out.println(student.getName()+" başarıyla silindi.");

    }
}