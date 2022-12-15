package interfaces;


public class TeacherRepo implements Repository<Teacher>{
    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher.getName()+" başarıyla kaydedildi.");

    }

    @Override
    public void get(Teacher teacher) {
        System.out.println(teacher.getName()+" başarıyla bulundu.");

    }

    @Override
    public void update(Teacher teacher) {
        System.out.println(teacher.getName()+" başarıyla güncellendi.");

    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println(teacher.getName()+" başarıyla silindi.");

    }
}