package Day10.Profile;

public class ProfileService {
    ProfileRepository profileRepository;

    public void saveProfile(ProfileRepository profileRepository) {
        // profileRepository = new ProfileDBRepository();
        // profileRepository = new ProfileMemoryRepository();
        profileRepository.save();

    }
}
