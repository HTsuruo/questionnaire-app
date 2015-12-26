package enums;

public enum QuestionType {
	
	SHINTAI(1),
	PANAS(2),
	WHO5(3),
	SELF_DISCLOSURE(4),
	ADULT_EFFORT(5),
	TIPI_J(6),
	TAC24(7),
	TRUST(8),
	IKIGAI(9),
	RESILIENCE(10),
	BISBAS(11),
	SELF_DISCLOSURE_2(14);
	
	private final Integer value;

	private QuestionType(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public static QuestionType fromValue(int value) {
		for (QuestionType state : values()) {
			if (value == state.getValue().intValue()) return state;
        }
		return null;
	}
}
