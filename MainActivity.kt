class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val sampleData = listOf("Ana", "Bruno", "Carlos", "Diana", "Eduardo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(sampleData)
    }
}
