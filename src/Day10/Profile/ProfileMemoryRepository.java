package Day10.Profile;

public class ProfileMemoryRepository implements ProfileRepository{
    @Override
    public void save() {
        System.out.println("메모리에 프로필 저장");
    }
}
