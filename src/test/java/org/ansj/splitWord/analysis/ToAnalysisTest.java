package org.ansj.splitWord.analysis;

import org.ansj.CorpusTest;
import org.junit.Test;

public class ToAnalysisTest extends CorpusTest{

	@Test
	public void test() {
		System.out.println(ToAnalysis.parse("品牌为1的客户数"));
		// for (String string : lines) {
		// 	System.out.println(ToAnalysis.parse(string));
		// }
	}

}
