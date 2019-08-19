package prob05;

public class UserNotFoundException extends Exception {
	public UserNotFoundException() {
		System.out.println("존재하지 않는 사용자 입니다.");
	}
	public UserNotFoundException(String message) {
		super(message);
	}
}
