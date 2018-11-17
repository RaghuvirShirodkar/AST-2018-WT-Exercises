import static org.junit.Assert.*;

import org.junit.Test;

public class functionDeterminationTest {

	@Test
	public void testFunctionValue() {
		
		// Test case 1 for kValue = 10, nValue = 20
		double[] expectedValues1 = {0.5, 0.9090909090909091, 0.95, 0.9655172413793104, 0.9736842105263158, 0.9787234042553191, 0.9821428571428571, 0.9846153846153847, 0.9864864864864865, 0.9865067466266867, 0.9865269461077845, 0.9865470852017937, 0.9865671641791045, 0.9865871833084948, 0.9866071428571429, 0.986627043090639, 0.9866468842729971, 0.9866666666666667, 0.9866863905325444, 0.9867060561299852};
		double[] actualValues1 = functionDetermination.functionValue(10, 20);
		
		for (int i = 0; i< 20; i++) {

			assertEquals(expectedValues1[i], actualValues1[i], 1e-5);	
		}

		// Test case 2 for kValue = 100, nValue = 120		
		double[] expectedValues2 = {0.5, 0.9090909090909091, 0.95, 0.9655172413793104, 0.9736842105263158, 0.9787234042553191, 0.9821428571428571, 0.9846153846153847, 0.9864864864864865, 0.9879518072289156, 0.9891304347826086, 0.9900990099009901, 0.990909090909091, 0.9915966386554622, 0.9921875, 0.9927007299270073, 0.9931506849315068, 0.9935483870967742, 0.9939024390243902, 0.9942196531791907, 0.9945054945054945, 0.9947643979057592, 0.995, 0.9952153110047847, 0.9954128440366973, 0.9955947136563876, 0.9957627118644068, 0.9959183673469387, 0.9960629921259843, 0.9961977186311787, 0.9963235294117647, 0.99644128113879, 0.996551724137931, 0.9966555183946488, 0.9967532467532467, 0.9968454258675079, 0.9969325153374233, 0.9970149253731343, 0.997093023255814, 0.9971671388101983, 0.9972375690607734, 0.9973045822102425, 0.9973684210526316, 0.9974293059125964, 0.9974874371859297, 0.9975429975429976, 0.9975961538461539, 0.9976470588235294, 0.9976958525345622, 0.9977426636568849, 0.9977876106194691, 0.9978308026030369, 0.997872340425532, 0.9979123173277662, 0.9979508196721312, 0.9979879275653923, 0.9980237154150198, 0.9980582524271845, 0.9980916030534351, 0.99812382739212, 0.9981549815498155, 0.9981851179673321, 0.9982142857142857, 0.9982425307557118, 0.9982698961937716, 0.9982964224872232, 0.9983221476510067, 0.9983471074380166, 0.998371335504886, 0.9983948635634029, 0.9984177215189873, 0.9984399375975039, 0.9984615384615385, 0.9984825493171472, 0.9985029940119761, 0.9985228951255539, 0.9985422740524781, 0.9985611510791367, 0.9985795454545454, 0.9985974754558204, 0.9986149584487535, 0.9986320109439124, 0.9986486486486487, 0.9986648865153538, 0.9986807387862797, 0.9986962190352021, 0.9987113402061856, 0.9987261146496815, 0.9987405541561712, 0.9987546699875467, 0.9987684729064039, 0.9987819732034104, 0.9987951807228915, 0.99880810488677, 0.9988207547169812, 0.9988331388564761, 0.9988452655889145, 0.9988571428571429, 0.998868778280543, 0.9988689204474048, 0.9988690625785374, 0.998869204673954, 0.9988693467336683, 0.9988694887576938, 0.9988696307460437, 0.9988697726987317, 0.998869914615771, 0.9988700564971752, 0.9988701983429575, 0.9988703401531317, 0.9988704819277109, 0.9988706236667085, 0.998870765370138, 0.9988709070380128, 0.9988710486703463, 0.9988711902671517, 0.9988713318284425, 0.998871473354232, 0.9988716148445336, 0.9988717562993606};
		double[] actualValues2 = functionDetermination.functionValue(100, 120);
		
		for (int i = 0; i< 120; i++) {
			
			assertEquals(expectedValues2[i], actualValues2[i], 1e-5);	
		}

		// Test case 3 for kValue = 1000, nValue = 1200		
		double[] expectedValues3 = {0.5, 0.9090909090909091, 0.95, 0.9655172413793104, 0.9736842105263158, 0.9787234042553191, 0.9821428571428571, 0.9846153846153847, 0.9864864864864865, 0.9879518072289156, 0.9891304347826086, 0.9900990099009901, 0.990909090909091, 0.9915966386554622, 0.9921875, 0.9927007299270073, 0.9931506849315068, 0.9935483870967742, 0.9939024390243902, 0.9942196531791907, 0.9945054945054945, 0.9947643979057592, 0.995, 0.9952153110047847, 0.9954128440366973, 0.9955947136563876, 0.9957627118644068, 0.9959183673469387, 0.9960629921259843, 0.9961977186311787, 0.9963235294117647, 0.99644128113879, 0.996551724137931, 0.9966555183946488, 0.9967532467532467, 0.9968454258675079, 0.9969325153374233, 0.9970149253731343, 0.997093023255814, 0.9971671388101983, 0.9972375690607734, 0.9973045822102425, 0.9973684210526316, 0.9974293059125964, 0.9974874371859297, 0.9975429975429976, 0.9975961538461539, 0.9976470588235294, 0.9976958525345622, 0.9977426636568849, 0.9977876106194691, 0.9978308026030369, 0.997872340425532, 0.9979123173277662, 0.9979508196721312, 0.9979879275653923, 0.9980237154150198, 0.9980582524271845, 0.9980916030534351, 0.99812382739212, 0.9981549815498155, 0.9981851179673321, 0.9982142857142857, 0.9982425307557118, 0.9982698961937716, 0.9982964224872232, 0.9983221476510067, 0.9983471074380166, 0.998371335504886, 0.9983948635634029, 0.9984177215189873, 0.9984399375975039, 0.9984615384615385, 0.9984825493171472, 0.9985029940119761, 0.9985228951255539, 0.9985422740524781, 0.9985611510791367, 0.9985795454545454, 0.9985974754558204, 0.9986149584487535, 0.9986320109439124, 0.9986486486486487, 0.9986648865153538, 0.9986807387862797, 0.9986962190352021, 0.9987113402061856, 0.9987261146496815, 0.9987405541561712, 0.9987546699875467, 0.9987684729064039, 0.9987819732034104, 0.9987951807228915, 0.99880810488677, 0.9988207547169812, 0.9988331388564761, 0.9988452655889145, 0.9988571428571429, 0.998868778280543, 0.9988801791713325, 0.9988913525498891, 0.9989023051591658, 0.9989130434782608, 0.9989235737351991, 0.9989339019189766, 0.9989440337909187, 0.9989539748953975, 0.9989637305699481, 0.9989733059548255, 0.9989827060020345, 0.998991935483871, 0.999000999000999, 0.999009900990099, 0.9990186457311089, 0.9990272373540856, 0.9990356798457087, 0.9990439770554493, 0.9990521327014218, 0.9990601503759399, 0.9990680335507922, 0.9990757855822551, 0.999083409715857, 0.9990909090909091, 0.9990982867448152, 0.9991055456171736, 0.9991126885536823, 0.9991197183098591, 0.9991266375545852, 0.9991334488734835, 0.999140154772141, 0.9991467576791809, 0.9991532599491956, 0.9991596638655462, 0.9991659716430359, 0.9991721854304636, 0.9991783073130649, 0.9991843393148451, 0.9991902834008097, 0.9991961414790996, 0.9992019154030327, 0.9992076069730587, 0.999213217938631, 0.99921875, 0.9992242048099301, 0.9992295839753467, 0.9992348890589136, 0.9992401215805471, 0.999245283018868, 0.9992503748125937, 0.9992553983618764, 0.9992603550295858, 0.9992652461425422, 0.9992700729927008, 0.9992748368382887, 0.9992795389048992, 0.9992841803865425, 0.9992887624466572, 0.9992932862190813, 0.9992977528089888, 0.9993021632937893, 0.9993065187239945, 0.9993108201240524, 0.9993150684931507, 0.9993192648059904, 0.9993234100135318, 0.9993275050437121, 0.9993315508021391, 0.9993355481727575, 0.9993394980184941, 0.9993434011818779, 0.9993472584856397, 0.9993510707332901, 0.9993548387096775, 0.9993585631815266, 0.9993622448979592, 0.9993658845909955, 0.9993694829760403, 0.9993730407523511, 0.9993765586034913, 0.9993800371977681, 0.9993834771886559, 0.9993868792152054, 0.999390243902439, 0.9993935718617344, 0.9993968636911942, 0.9994001199760048, 0.9994033412887828, 0.9994065281899109, 0.999409681227863, 0.9994128009395185, 0.9994158878504673, 0.999418942475305, 0.999421965317919, 0.9994249568717654, 0.9994279176201373, 0.9994308480364257, 0.9994337485843715, 0.9994366197183099, 0.999439461883408, 0.9994422755158952, 0.9994450610432852, 0.9994478188845941, 0.9994505494505495, 0.9994532531437944, 0.999455930359086, 0.9994585814834868, 0.9994612068965517, 0.9994638069705094, 0.9994663820704376, 0.9994689325544344, 0.9994714587737844, 0.9994739610731194, 0.9994764397905759, 0.9994788952579469, 0.9994813278008299, 0.9994837377387713, 0.9994861253854059, 0.9994884910485934, 0.9994908350305499, 0.9994931576279777, 0.9994954591321897, 0.9994977398292315, 0.9995, 0.9995022399203584, 0.9995044598612488, 0.9995066600888012, 0.99950884086444, 0.9995110024449878, 0.9995131450827653, 0.9995152690256908, 0.9995173745173745, 0.9995194617972128, 0.9995215311004785, 0.9995235826584088, 0.9995256166982922, 0.9995276334435522, 0.9995296331138288, 0.9995316159250586, 0.9995335820895522, 0.9995355318160706, 0.9995374653098983, 0.9995393827729157, 0.9995412844036697, 0.9995431703974418, 0.9995450409463148, 0.9995468962392388, 0.9995487364620939, 0.9995505617977528, 0.9995523724261415, 0.9995541685242978, 0.9995559502664298, 0.9995577178239717, 0.9995594713656387, 0.9995612110574813, 0.9995629370629371, 0.999564649542882, 0.9995663486556808, 0.9995680345572354, 0.9995697074010327, 0.9995713673381912, 0.9995730145175064, 0.9995746490854955, 0.9995762711864407, 0.9995778809624314, 0.9995794785534062, 0.9995810640971932, 0.9995826377295493, 0.9995841995841996, 0.9995857497928748, 0.9995872884853487, 0.9995888157894737, 0.9995903318312167, 0.9995918367346939, 0.9995933306222041, 0.9995948136142626, 0.9995962858296327, 0.999597747385358, 0.9995991983967936, 0.9996006389776357, 0.9996020692399522, 0.999603489294211, 0.9996048992493086, 0.9996062992125985, 0.9996076892899176, 0.9996090695856138, 0.9996104402025711, 0.999611801242236, 0.9996131528046421, 0.9996144949884348, 0.9996158278908951, 0.9996171516079633, 0.9996184662342618, 0.9996197718631179, 0.9996210685865858, 0.9996223564954683, 0.9996236356793377, 0.9996249062265566, 0.9996261682242991, 0.9996274217585693, 0.999628666914222, 0.9996299037749815, 0.99963113242346, 0.9996323529411765, 0.9996335654085746, 0.9996347699050402, 0.9996359665089188, 0.9996371552975326, 0.9996383363471971, 0.9996395097332372, 0.9996406755300036, 0.9996418338108882, 0.9996429846483399, 0.999644128113879, 0.9996452642781128, 0.9996463932107497, 0.9996475149806133, 0.999648629655657, 0.9996497373029772, 0.9996508379888268, 0.9996519317786287, 0.9996530187369882, 0.9996540989277066, 0.9996551724137931, 0.9996562392574768, 0.9996572995202193, 0.9996583532627263, 0.9996594005449592, 0.999660441426146, 0.9996614759647935, 0.9996625042186973, 0.9996635262449529, 0.9996645420999665, 0.9996655518394649, 0.9996665555185061, 0.9996675531914894, 0.9996685449121644, 0.9996695307336417, 0.999670510708402, 0.9996714848883048, 0.9996724533245988, 0.9996734160679295, 0.9996743731683491, 0.9996753246753247, 0.9996762706377469, 0.999677211103938, 0.9996781461216607, 0.9996790757381258, 0.99968, 0.9996809189534142, 0.9996818326439707, 0.9996827411167513, 0.999683644416324, 0.9996845425867508, 0.9996854356715948, 0.9996863237139272, 0.999687206756334, 0.9996880848409233, 0.9996889580093312, 0.9996898263027295, 0.9996906897618311, 0.999691548426897, 0.9996924023377423, 0.9996932515337423, 0.9996940960538391, 0.9996949359365467, 0.9996957712199575, 0.9996966019417476, 0.999697428139183, 0.9996982498491249, 0.9996990671080349, 0.9996998799519808, 0.9997006884166417, 0.9997014925373134, 0.9997022923489134, 0.9997030878859857, 0.9997038791827065, 0.9997046662728883, 0.9997054491899853, 0.9997062279670975, 0.9997070026369763, 0.9997077732320281, 0.9997085397843194, 0.9997093023255814, 0.9997100608872137, 0.9997108155002892, 0.9997115661955581, 0.9997123130034522, 0.999713055954089, 0.9997137950772753, 0.9997145304025121, 0.9997152619589977, 0.9997159897756319, 0.9997167138810198, 0.9997174343034756, 0.9997181510710259, 0.9997188642114141, 0.9997195737521032, 0.9997202797202798, 0.9997209821428571, 0.9997216810464793, 0.9997223764575236, 0.9997230684021047, 0.9997237569060774, 0.99972444199504, 0.9997251236943375, 0.999725802029065, 0.99972647702407, 0.9997271487039563, 0.9997278170930866, 0.9997284822155851, 0.9997291440953413, 0.9997298027560119, 0.9997304582210242, 0.9997311105135789, 0.9997317596566524, 0.9997324056729997, 0.9997330485851575, 0.9997336884154461, 0.9997343251859724, 0.9997349589186324, 0.9997355896351137, 0.9997362173568979, 0.9997368421052631, 0.9997374639012864, 0.999738082765846, 0.9997386987196237, 0.9997393117831074, 0.999739921976593, 0.9997405293201869, 0.9997411338338079, 0.99974173553719, 0.999742334449884, 0.9997429305912596, 0.9997435239805078, 0.9997441146366428, 0.999744702578504, 0.999745287824758, 0.9997458703939008, 0.9997464503042597, 0.9997470275739945, 0.9997476022211005, 0.9997481742634097, 0.999748743718593, 0.9997493106041614, 0.9997498749374687, 0.9997504367357125, 0.9997509960159362, 0.999751552795031, 0.9997521070897373, 0.9997526589166461, 0.9997532082922014, 0.9997537552327013, 0.9997542997542997, 0.9997548418730081, 0.9997553816046967, 0.9997559189650964, 0.9997564539698003, 0.9997569866342649, 0.9997575169738119, 0.9997580450036293, 0.9997585707387735, 0.9997590941941701, 0.9997596153846153, 0.9997601343247782, 0.9997606510292005, 0.9997611655123, 0.9997616777883699, 0.9997621878715814, 0.9997626957759849, 0.9997632015155103, 0.9997637051039697, 0.9997642065550578, 0.9997647058823529, 0.999765203099319, 0.9997656982193065, 0.999766191255553, 0.9997666822211853, 0.99976717112922, 0.9997676579925651, 0.9997681428240204, 0.9997686256362796, 0.9997691064419303, 0.9997695852534563, 0.9997700620832375, 0.9997705369435521, 0.9997710098465766, 0.9997714808043876, 0.9997719498289623, 0.9997724169321802, 0.9997728821258233, 0.9997733454215775, 0.9997738068310337, 0.9997742663656884, 0.9997747240369452, 0.9997751798561151, 0.9997756338344178, 0.9997760859829825, 0.9997765363128491, 0.9997769848349688, 0.9997774315602047, 0.9997778764993336, 0.9997783196630459, 0.9997787610619469, 0.9997792007065578, 0.999779638607316, 0.9997800747745766, 0.9997805092186128, 0.9997809419496166, 0.9997813729777001, 0.9997818023128955, 0.9997822299651568, 0.9997826559443599, 0.9997830802603037, 0.9997835029227106, 0.9997839239412273, 0.9997843433254259, 0.9997847610848042, 0.9997851772287862, 0.9997855917667239, 0.9997860047078965, 0.9997864160615122, 0.9997868258367086, 0.9997872340425532, 0.9997876406880442, 0.9997880457821111, 0.9997884493336154, 0.9997888513513513, 0.9997892518440463, 0.9997896508203618, 0.9997900482888935, 0.9997904442581727, 0.999790838736666, 0.9997912317327766, 0.9997916232548447, 0.9997920133111481, 0.9997924019099025, 0.9997927890592623, 0.9997931747673217, 0.999793559042114, 0.9997939418916134, 0.9997943233237351, 0.9997947033463355, 0.9997950819672131, 0.9997954591941092, 0.999795835034708, 0.9997962094966375, 0.9997965825874695, 0.9997969543147208, 0.9997973246858533, 0.9997976937082743, 0.9997980613893377, 0.9997984277363435, 0.9997987927565393, 0.9997991564571199, 0.9997995188452286, 0.9997998799279568, 0.9998002397123452, 0.9998005982053838, 0.9998009554140127, 0.9998013113451222, 0.9998016660055533, 0.9998020194020986, 0.999802371541502, 0.9998027224304596, 0.9998030720756204, 0.9998034204835856, 0.9998037676609105, 0.9998041136141038, 0.9998044583496285, 0.999804801873902, 0.9998051441932969, 0.9998054853141413, 0.9998058252427184, 0.9998061639852684, 0.9998065015479877, 0.9998068379370292, 0.9998071731585036, 0.9998075072184793, 0.9998078401229823, 0.9998081718779973, 0.9998085024894676, 0.9998088319632957, 0.9998091603053435, 0.9998094875214326, 0.999809813617345, 0.9998101385988228, 0.9998104624715694, 0.9998107852412488, 0.999811106913487, 0.9998114274938714, 0.9998117469879518, 0.9998120654012403, 0.999812382739212, 0.9998126990073047, 0.99981301421092, 0.9998133283554228, 0.9998136414461424, 0.9998139534883721, 0.99981426448737, 0.999814574448359, 0.9998148833765272, 0.9998151912770282, 0.9998154981549815, 0.9998158040154724, 0.9998161088635528, 0.9998164127042408, 0.9998167155425219, 0.9998170173833486, 0.9998173182316404, 0.9998176180922852, 0.9998179169701383, 0.9998182148700236, 0.9998185117967332, 0.9998188077550281, 0.9998191027496383, 0.9998193967852628, 0.9998196898665705, 0.9998199819981998, 0.9998202731847592, 0.9998205634308271, 0.9998208527409531, 0.9998211411196566, 0.9998214285714285, 0.9998217151007309, 0.9998220007119971, 0.9998222854096321, 0.9998225691980128, 0.999822852081488, 0.9998231340643792, 0.99982341515098, 0.9998236953455572, 0.99982397465235, 0.9998242530755712, 0.9998245306194069, 0.9998248072880168, 0.9998250830855344, 0.9998253580160671, 0.9998256320836966, 0.9998259052924791, 0.9998261776464453, 0.9998264491496008, 0.9998267198059262, 0.9998269896193772, 0.999827258593885, 0.9998275267333563, 0.9998277940416739, 0.999828060522696, 0.9998283261802575, 0.9998285910181693, 0.999828855040219, 0.9998291182501708, 0.999829380651766, 0.9998296422487223, 0.9998299030447355, 0.9998301630434783, 0.999830422248601, 0.9998306806637318, 0.9998309382924767, 0.99983119513842, 0.9998314512051238, 0.9998317064961293, 0.9998319610149554, 0.9998322147651006, 0.9998324677500419, 0.9998327199732352, 0.9998329714381159, 0.9998332221480988, 0.9998334721065778, 0.9998337213169272, 0.9998339697825004, 0.9998342175066313, 0.9998344644926337, 0.9998347107438017, 0.9998349562634098, 0.9998352010547132, 0.9998354451209478, 0.9998356884653302, 0.9998359310910583, 0.9998361730013107, 0.9998364141992475, 0.9998366546880104, 0.9998368944707225, 0.9998371335504886, 0.9998373719303952, 0.9998376096135109, 0.9998378466028863, 0.9998380829015544, 0.9998383185125304, 0.9998385534388118, 0.999838787683379, 0.9998390212491951, 0.9998392541392059, 0.9998394863563402, 0.9998397179035102, 0.9998399487836107, 0.9998401789995205, 0.9998404085541015, 0.9998406374501992, 0.9998408656906429, 0.9998410932782457, 0.9998413202158045, 0.9998415465061005, 0.9998417721518987, 0.9998419971559488, 0.9998422215209846, 0.9998424452497243, 0.999842668344871, 0.9998428908091124, 0.9998431126451208, 0.9998433338555538, 0.9998435544430538, 0.9998437744102484, 0.9998439937597504, 0.999844212494158, 0.9998444306160548, 0.99984464812801, 0.9998448650325783, 0.9998450813323005, 0.9998452970297029, 0.999845512127298, 0.9998457266275841, 0.9998459405330458, 0.9998461538461538, 0.9998463665693655, 0.9998465787051243, 0.9998467902558603, 0.9998470012239902, 0.9998472116119175, 0.9998474214220323, 0.9998476306567119, 0.9998478393183201, 0.9998480474092083, 0.9998482549317147, 0.9998484618881649, 0.9998486682808717, 0.9998488741121354, 0.9998490793842438, 0.9998492840994725, 0.9998494882600842, 0.9998496918683301, 0.9998498949264485, 0.9998500974366662, 0.9998502994011976, 0.9998505008222455, 0.9998507017020006, 0.999850902042642, 0.9998511018463371, 0.9998513011152417, 0.9998514998514999, 0.9998516980572445, 0.9998518957345972, 0.9998520928856678, 0.9998522895125553, 0.9998524856173477, 0.9998526812021213, 0.9998528762689421, 0.9998530708198649, 0.9998532648569333, 0.9998534583821805, 0.9998536513976292, 0.9998538439052909, 0.9998540359071668, 0.9998542274052478, 0.999854418401514, 0.9998546088979354, 0.9998547988964717, 0.9998549883990719, 0.9998551774076756, 0.9998553659242118, 0.9998555539505994, 0.9998557414887478, 0.9998559285405562, 0.9998561151079137, 0.9998563011927001, 0.9998564867967853, 0.9998566719220295, 0.9998568565702834, 0.9998570407433881, 0.9998572244431754, 0.9998574076714672, 0.9998575904300769, 0.9998577727208079, 0.9998579545454546, 0.9998581359058022, 0.9998583168036271, 0.9998584972406962, 0.9998586772187676, 0.9998588567395907, 0.9998590358049055, 0.9998592144164438, 0.999859392575928, 0.9998595702850723, 0.999859747545582, 0.9998599243591539, 0.9998601007274762, 0.9998602766522285, 0.9998604521350823, 0.9998606271777003, 0.9998608017817372, 0.9998609759488392, 0.9998611496806442, 0.9998613229787824, 0.9998614958448754, 0.9998616682805367, 0.9998618402873722, 0.9998620118669794, 0.9998621830209482, 0.9998623537508603, 0.9998625240582898, 0.999862693944803, 0.9998628634119583, 0.9998630324613067, 0.9998632010943912, 0.9998633693127477, 0.9998635371179039, 0.9998637045113806, 0.999863871494691, 0.9998640380693405, 0.9998642042368278, 0.9998643699986437, 0.9998645353562721, 0.9998647003111892, 0.9998648648648648, 0.999865029018761, 0.9998651927743327, 0.9998653561330282, 0.9998655190962883, 0.9998656816655473, 0.9998658438422323, 0.9998660056277636, 0.9998661670235546, 0.9998663280310119, 0.9998664886515354, 0.9998666488865182, 0.9998668087373468, 0.9998669682054011, 0.9998671272920542, 0.9998672859986728, 0.9998674443266172, 0.9998676022772408, 0.999867759851891, 0.9998679170519086, 0.999868073878628, 0.9998682303333772, 0.9998683864174783, 0.9998685421322466, 0.9998686974789915, 0.9998688524590164, 0.999869007073618, 0.9998691613240874, 0.9998693152117094, 0.9998694687377627, 0.9998696219035202, 0.9998697747102487, 0.9998699271592092, 0.9998700792516565, 0.9998702309888399, 0.9998703823720025, 0.9998705334023822, 0.9998706840812104, 0.9998708344097132, 0.999870984389111, 0.9998711340206186, 0.9998712833054447, 0.999871432244793, 0.9998715808398613, 0.999871729091842, 0.9998718770019218, 0.9998720245712823, 0.9998721718010993, 0.9998723186925434, 0.9998724652467798, 0.9998726114649682, 0.9998727573482631, 0.9998729028978139, 0.9998730481147645, 0.9998731930002536, 0.9998733375554149, 0.9998734817813765, 0.999873625679262, 0.9998737692501893, 0.9998739124952717, 0.9998740554156171, 0.9998741980123286, 0.9998743402865041, 0.9998744822392368, 0.9998746238716149, 0.9998747651847214, 0.9998749061796347, 0.9998750468574285, 0.9998751872191712, 0.999875327265927, 0.9998754669987546, 0.9998756064187088, 0.999875745526839, 0.9998758843241902, 0.9998760228118027, 0.9998761609907121, 0.9998762988619495, 0.9998764364265414, 0.9998765736855098, 0.9998767106398718, 0.9998768472906404, 0.9998769836388239, 0.9998771196854264, 0.9998772554314471, 0.9998773908778813, 0.9998775260257196, 0.9998776608759481, 0.999877795429549, 0.9998779296875, 0.9998780636507743, 0.999878197320341, 0.9998783306971651, 0.9998784637822071, 0.9998785965764234, 0.9998787290807665, 0.9998788612961841, 0.9998789932236205, 0.9998791248640154, 0.9998792562183048, 0.9998793872874201, 0.9998795180722891, 0.9998796485738356, 0.9998797787929791, 0.9998799087306353, 0.9998800383877159, 0.9998801677651288, 0.9998802968637779, 0.9998804256845629, 0.9998805542283803, 0.9998806824961222, 0.9998808104886769, 0.9998809382069294, 0.9998810656517603, 0.9998811928240465, 0.9998813197246618, 0.9998814463544754, 0.9998815727143534, 0.999881698805158, 0.9998818246277476, 0.9998819501829772, 0.9998820754716982, 0.999882200494758, 0.9998823252530007, 0.9998824497472669, 0.9998825739783936, 0.9998826979472141, 0.9998828216545582, 0.9998829451012525, 0.9998830682881198, 0.9998831912159795, 0.9998833138856477, 0.9998834362979369, 0.9998835584536563, 0.9998836803536117, 0.9998838019986056, 0.999883923389437, 0.9998840445269017, 0.9998841654117919, 0.999884286044897, 0.9998844064270026, 0.9998845265588915, 0.9998846464413427, 0.9998847660751325, 0.9998848854610337, 0.999885004599816, 0.9998851234922458, 0.9998852421390865, 0.9998853605410982, 0.999885478699038, 0.9998855966136597, 0.9998857142857143, 0.9998858317159494, 0.9998859489051095, 0.9998860658539365, 0.9998861825631686, 0.9998862990335418, 0.9998864152657883, 0.9998865312606376, 0.9998866470188166, 0.9998867625410486, 0.9998868778280543, 0.9998869928805515, 0.9998871076992549, 0.9998872222848765, 0.9998873366381252, 0.9998874507597074, 0.999887564650326, 0.9998876783106818, 0.9998877917414721, 0.999887904943392, 0.9998880179171332, 0.9998881306633851, 0.9998882431828342, 0.999888355476164, 0.9998884675440554, 0.9998885793871867, 0.9998886910062333, 0.9998886923828487, 0.9998886937594301, 0.9998886951359774, 0.9998886965124907, 0.99988869788897, 0.9998886992654151, 0.9998887006418263, 0.9998887020182035, 0.9998887033945465, 0.9998887047708555, 0.9998887061471304, 0.9998887075233714, 0.9998887088995784, 0.9998887102757512, 0.9998887116518901, 0.9998887130279949, 0.9998887144040657, 0.9998887157801024, 0.9998887171561051, 0.9998887185320738, 0.9998887199080084, 0.999888721283909, 0.9998887226597757, 0.9998887240356084, 0.9998887254114068, 0.9998887267871714, 0.999888728162902, 0.9998887295385985, 0.999888730914261, 0.9998887322898895, 0.9998887336654839, 0.9998887350410444, 0.9998887364165708, 0.9998887377920633, 0.9998887391675217, 0.9998887405429462, 0.9998887419183365, 0.9998887432936929, 0.9998887446690153, 0.9998887460443038, 0.9998887474195582, 0.9998887487947786, 0.999888750169965, 0.9998887515451175, 0.9998887529202358, 0.9998887542953203, 0.9998887556703707, 0.9998887570453872, 0.9998887584203696, 0.999888759795318, 0.9998887611702325, 0.9998887625451129, 0.9998887639199595, 0.999888765294772, 0.9998887666695505, 0.999888768044295, 0.9998887694190056, 0.9998887707936822, 0.9998887721683248, 0.9998887735429334, 0.999888774917508, 0.9998887762920488, 0.9998887776665555, 0.9998887790410281, 0.9998887804154669, 0.9998887817898717, 0.9998887831642426, 0.9998887845385794, 0.9998887859128823, 0.9998887872871512, 0.9998887886613862, 0.9998887900355872, 0.9998887914097542, 0.9998887927838873, 0.9998887941579865, 0.9998887955320516, 0.9998887969060828, 0.99988879828008, 0.9998887996540433, 0.9998888010279727, 0.9998888024018682, 0.9998888037757295, 0.999888805149557, 0.9998888065233507, 0.9998888078971102, 0.9998888092708359, 0.9998888106445276, 0.9998888120181854, 0.9998888133918092, 0.9998888147653991, 0.9998888161389551, 0.9998888175124772, 0.9998888188859653, 0.9998888202594194, 0.9998888216328397, 0.999888823006226, 0.9998888243795783, 0.9998888257528967, 0.9998888271261812, 0.9998888284994318, 0.9998888298726485, 0.9998888312458312, 0.99988883261898, 0.9998888339920948, 0.9998888353651758, 0.9998888367382228, 0.999888838111236, 0.9998888394842153, 0.9998888408571605, 0.9998888422300719, 0.9998888436029494, 0.9998888449757929, 0.9998888463486025, 0.9998888477213783, 0.9998888490941201, 0.9998888504668281, 0.999888851839502, 0.9998888532121422, 0.9998888545847484, 0.9998888559573207, 0.9998888573298591, 0.9998888587023637, 0.9998888600748342, 0.999888861447271, 0.9998888628196737, 0.9998888641920427, 0.9998888655643777, 0.9998888669366789, 0.9998888683089461, 0.9998888696811795, 0.999888871053379, 0.9998888724255445, 0.9998888737976762, 0.9998888751697741, 0.999888876541838, 0.999888877913868, 0.9998888792858642, 0.9998888806578266, 0.9998888820297549, 0.9998888834016495, 0.9998888847735101, 0.9998888861453369, 0.9998888875171298, 0.9998888888888889, 0.9998888902606141, 0.9998888916323053, 0.9998888930039628, 0.9998888943755864, 0.9998888957471761, 0.999888897118732, 0.999888898490254, 0.999888899861742, 0.9998889012331963, 0.9998889026046167, 0.9998889039760033, 0.999888905347356, 0.9998889067186748, 0.9998889080899598, 0.9998889094612109, 0.9998889108324281, 0.9998889122036115, 0.9998889135747612, 0.9998889149458768, 0.9998889163169588, 0.9998889176880068, 0.999888919059021, 0.9998889204300013, 0.9998889218009479, 0.9998889231718605, 0.9998889245427394, 0.9998889259135844, 0.9998889272843955, 0.9998889286551729, 0.9998889300259163, 0.9998889313966259, 0.9998889327673018, 0.9998889341379438, 0.999888935508552, 0.9998889368791263, 0.9998889382496668, 0.9998889396201736, 0.9998889409906464, 0.9998889423610854, 0.9998889437314906, 0.999888945101862, 0.9998889464721996, 0.9998889478425034, 0.9998889492127733, 0.9998889505830094, 0.9998889519532117, 0.9998889533233802, 0.9998889546935149, 0.9998889560636158, 0.9998889574336829, 0.9998889588037162, 0.9998889601737156, 0.9998889615436813, 0.9998889629136132, 0.9998889642835112, 0.9998889656533755, 0.9998889670232058};
		double[] actualValues3 = functionDetermination.functionValue(1000, 1200);
		
		for (int i = 0; i< 1200; i++) {
			
			assertEquals(expectedValues3[i], actualValues3[i], 1e-5);	
		}
	}
}